package edu.kit.scc.cfeditor.validation;

import org.eclipse.emf.common.util.EList;

import edu.kit.scc.cfeditor.definitions.CfDefinitionProvider;

public class CfFunctionValidator {
	private CfDefinitionProvider defProvider = CfDefinitionProvider.getInstance();
	private CfFunctionType typeEnum;

	public String checkBodyFunction(String functionName, EList<String> values, Boolean isList, EList<String> variables) {
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
					if (isList) {
						errorString = "List \"{...}\" not allowed";
					} else if (isVariable(values.get(0))) {
						if (!isInVariables(values.get(0), variables)) {
							errorString = "Variable not defined";
						}
					} else if (null != (customMessage = checkSTRING(values.get(0), typeRange))) {
						errorString = customMessage;
					}
					break;
				case INT:
					if (isList) {
						errorString = "List \"{...}\" not allowed";
					} else if (isVariable(values.get(0))) {
						if (!isInVariables(values.get(0), variables)) {
							errorString = "Variable not defined";
						}
					} else if (null != (customMessage = checkINT(values.get(0), typeRange))) {
						errorString = customMessage;
					}
					break;
				case REAL:
					if (isList) {
						errorString = "List \"{...}\" not allowed";
					} else if (isVariable(values.get(0))) {
						if (!isInVariables(values.get(0), variables)) {
							errorString = "Variable not defined";
						}
					} else if (null != (customMessage = checkREAL(values.get(0), typeRange))) {
						errorString = customMessage;
					}
					break;	
				case SLIST:
					if (!isList) {
						errorString = "List \"{...}\" expected";
					}
					break;
				case IRANGE:
					if (isList) {
						errorString = "List \"{...}\" not allowed";
					}
					break;
				case OPTION:
					if (isList) {
						errorString = "List \"{...}\" not allowed";
					} else if (isVariable(values.get(0))) {
						if (!isInVariables(values.get(0), variables)) {
							errorString = "Variable not defined";
						}
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
			long intValue = Long.parseLong(value);

			if (!range.isEmpty()) {
				String[] bounds = range.split(",", 2);
				long low = Long.parseLong(bounds[0]);
				long high = Long.parseLong(bounds[1]);

				if (intValue < low || intValue > high) {
					return "Parameter is out of allowed range";
				}
			}
		} catch (NumberFormatException e) {
			return "Parameter has to be int";
		}
		return null;
	}
	
	public String checkREAL(String value, String range) {
		try {
			double doubleValue = Double.parseDouble(value);

			if (!range.isEmpty()) {
				String[] bounds = range.split(",", 2);
				double low = Double.parseDouble(bounds[0]);
				double high = Double.parseDouble(bounds[1]);

				if (doubleValue < low || doubleValue > high) {
					return "Parameter is out of allowed range";
				}
			}
		} catch (NumberFormatException e) {
			return "Parameter has to be a real number";
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
	public Boolean isVariable(String value) {
		return value.matches("\\$\\(.*\\)")||value.matches("\\$\\{.*\\}");
	}

	public String getVariableFromString(String value) {
		String variable = value.substring(2, value.length() - 1);
		return variable;
	}

	public Boolean isInVariables(String value, EList<String> variables) {
		if (null != variables) {
			value = getVariableFromString(value);
			
			for (String variable : variables) {
				if (variable.equals(value)) {
					return true;
				}
			}
		}

		return false;
	}
}
