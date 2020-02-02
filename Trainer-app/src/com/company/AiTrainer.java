package com.company;

public class AiTrainer implements Trainer {

    private Service theService;
    private String email;
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTheService(Service myService){
        theService=myService;
    }

    @Override
    public String getDailyHomework() {
        return "Learn advance calculus ";
    }

    @Override
    public String getDailyService() {
        return theService.getServiceDesc();
    }
}
