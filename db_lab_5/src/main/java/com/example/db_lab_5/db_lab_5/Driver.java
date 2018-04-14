package com.example.db_lab_5.db_lab_5;

import javax.swing.JFrame;

import com.example.windows.Main_Window;

public class Driver 
{
    public static void main( String[] args )
    {
	      Main_Window textAreaFrame = new Main_Window(); 
	      textAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      textAreaFrame.setSize(500, 500); 
	      textAreaFrame.setVisible(true); 
    }
}
