package com.example.taskno19;

import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects ;

    public Portfolio() {
    }

    public Portfolio(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }
    public double getPortfolioCost(ArrayList projects){
        double total=0 ;
        if (projects.size() != 0 ) {
            total+=projects.indexOf(2) ;
            System.out.println(total);
            return total ;
        }
        else
            return 0.0 ;
    }
    public void showPortfolio() {
        for (Project proj:projects) {
             System.out.println(proj + "cost"+ proj.getInitialCost());
        }
    }
}
