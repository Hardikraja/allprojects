package com.company;

public class PythonTrainer  implements Trainer {

    private Service myService;

    public PythonTrainer(Service theService) {
        myService=theService;
    }

    @Override
    public String getDailyHomework() {
        return "practice python daily...";
    }

    @Override
    public String getDailyService() {
        return myService.getServiceDesc();
    }


}
