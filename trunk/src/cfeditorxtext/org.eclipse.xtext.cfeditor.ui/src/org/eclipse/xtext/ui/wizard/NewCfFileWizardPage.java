package org.eclipse.xtext.ui.wizard;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewCfFileWizardPage extends WizardNewFileCreationPage {

    public NewCfFileWizardPage(IStructuredSelection selection) {
        super("NewCfFileWizardPage", selection);
        setTitle("Cf File");
        setDescription("Creates a new Cf File");
        setFileExtension("cf");
    }

//    @Override
//    protected InputStream getInitialContents() {
//        try {
//            //return Activator.getDefault().getBundle().getEntry("/resources/newFileContents.config").openStream();
//        } catch (IOException e) {
//            return null; // ignore and create empty comments
//        }
//    }
}