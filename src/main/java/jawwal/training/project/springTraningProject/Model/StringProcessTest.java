package jawwal.training.project.springTraningProject.Model;

import jawwal.training.project.springTraningProject.FunctionalInterface.StringProcessing;

public class StringProcessTest {


    private String name;

    public void getNameAfterProcessing(StringProcessing processing) {
        this.name = processing.Process();
    }

}
