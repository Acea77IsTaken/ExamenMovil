package com.example.examenmovil.Clases;

public class SingletonController {

    private static Controller controller;

    private SingletonController(){}

    public static Controller getinstance()
    {
        if (controller == null)
        {
            controller = new Controller();
        }
        return controller;
    }
}
