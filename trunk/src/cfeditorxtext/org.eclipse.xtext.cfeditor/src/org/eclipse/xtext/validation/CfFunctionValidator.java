package org.eclipse.xtext.validation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.definitions.CfDefinitionProvider;

public class CfFunctionValidator {
	private CfDefinitionProvider defProvider = CfDefinitionProvider.getInstance();
	private CfFunctionType typeEnum;

	public String checkBodyFunction(String functionName, EList<String> values) {
		String errorString = null;

		String[] functionAttributes = defProvider.getBodyPromiseTypes().get(functionName);
		
		if (null != functionAttributes && !values.isEmpty()) {
			String functionType = functionAttributes[0];
			String typeRange = functionAttributes[1];

			try {
				typeEnum = CfFunctionType.valueOf(functionType);
				String customMessage;
				switch (typeEnum) {
				case STRING:
					if (values.size() > 1) {
						errorString = "Too many arguments";
					} else if (null != (customMessage = checkSTRING(values.get(0), typeRange))) {
						errorString = customMessage;
					}
					break;
				case INT:
					if (values.size() > 1) {
						errorString = "Too many arguments";
					} else if (null != (customMessage = checkINT(values.get(0), typeRange))) {
						errorString = customMessage;
					}
					break;
				case SLIST:
					break;
				case IRANGE:
					break;
				case OPTION:
					if (values.size() > 1) {
						errorString = "Too many arguments";
					} else if (null != (customMessage = checkOPTION(values.get(0), typeRange))) {
						errorString = customMessage;
					}
					break;
				}
			} catch (IllegalArgumentException e) {

			} catch (NullPointerException e) {

			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
		return errorString;
	}

	// public Boolean checkINT(String value, String range) {
	// try {
	// int intValue = Integer.parseInt(value);
	//
	// if (null != range) {
	// String[] bounds = range.split(",", 2);
	// int low = Integer.parseInt(bounds[0]);
	// int high = Integer.parseInt(bounds[1]);
	//
	// if (intValue < low || intValue > high) {
	// return false;
	// }
	// }
	//
	// } catch (NumberFormatException e) {
	// return false;
	// }
	// return true;
	// }

	public String checkINT(String value, String range) {
		try {
			int intValue = Integer.parseInt(value);

			if (null != range) {
				String[] bounds = range.split(",", 2);
				long low = Long.parseLong(bounds[0]);
				long high = Long.parseLong(bounds[1]);// TODO long or int
														// ("0..9999..." or " ")

				if (intValue < low || intValue > high) {
					return "Parameter is out of allowed range";
				}
			}
		} catch (NumberFormatException e) {
			return "Parameter has to be int";
		}
		return null;
	}

	public String checkOPTION(String value, String strOptions) {
		String[] options = strOptions.split(",");
		for (String option : options) {
			if (option.equals(value)) {
				return null;
			}
		}
		return "Parameter is no valid option";
	}

	public String checkSTRING(String value, String pattern) {
		if (!pattern.isEmpty()) {
			if (!value.matches(pattern)) {
				return "Parameter does not match pattern: " + pattern;
			}
		}
		return null;
	}

	// private Boolean checkValues(EList<String> values, String range, Method
	// method) throws IllegalArgumentException,
	// IllegalAccessException, InvocationTargetException {
	// for (String value : values) {
	// if (!(Boolean) method.invoke(this, value, range)) {
	// return false;
	// }
	// }
	// return true;
	// }
}
