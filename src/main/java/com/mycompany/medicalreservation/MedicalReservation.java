package com.mycompany.medicalreservation;

import javax.swing.JOptionPane;
public class MedicalReservation {
    public static void main(String[] args) {
    // Show the welcome message
    JOptionPane.showMessageDialog(null, "Welcome to Medical Reservation page", "Greetings", JOptionPane.INFORMATION_MESSAGE);                                                                                         
    // Show the start message
    JOptionPane.showMessageDialog(null, "click the button below to start", "Start", JOptionPane.INFORMATION_MESSAGE);
    // Show the menu
    JOptionPane.showMessageDialog(null, "our Menu: " + "\n" + "1. Room Reservation" + "\n" + "or" + "\n" + "2. Request an Emergency Car", "Menu" ,
                                  JOptionPane.INFORMATION_MESSAGE);
    // Get user inputs
    String ReservationType = JOptionPane.showInputDialog(null, "Wich service do you want: " + "\n" + "Enter 'reservation' for Room Reservation" + "\n" +
                                                         "or" + "\n" + "Enter 'emergency car' for Request an Emergency Car", "Input",
                                                         JOptionPane.QUESTION_MESSAGE);
    ReservationType = ReservationType.toLowerCase();
    if(ReservationType.equals("emergency car")){
        JOptionPane.showMessageDialog(null, "you chose to get an Emergency Car", "Output",JOptionPane.INFORMATION_MESSAGE);
        //  entering hospitals 
        String[]enteringHospitals = {"Baxsheen Hospital", "Shar Hospital", "Safeen Hospital", "Mercy Hospital"};
        for (int i = 0; i < enteringHospitals.length; i++){
            JOptionPane.showMessageDialog(null, "Available Hospitals: " + "\n" + (i+1) + "." + enteringHospitals[i] + "\n" + (i+2) + "." + 
                                          enteringHospitals[i+1] + "\n" + (i+3) + "." + enteringHospitals[i+2] + "\n" + (i+4) + "." + 
                                          enteringHospitals[i+3], "Output", JOptionPane.INFORMATION_MESSAGE);
            String availableHospital = JOptionPane.showInputDialog(null, "Choose an available Hospital: " + "\n" +
                                       "Enter the name of the hospital to choose it " + "\n" + (i+1) + ". " + enteringHospitals[i] + "\n" + (i+2) + ". " +
                                       enteringHospitals[i+1] + "\n" + (i+3) + ". " + enteringHospitals[i+2] + "\n" + (i+4) + ". " + enteringHospitals[i+3],
                                       "Input" , JOptionPane.QUESTION_MESSAGE);
            availableHospital = availableHospital.toLowerCase();
            if(availableHospital.equals("baxsheen hospital") || availableHospital.equals("shar hospital") || availableHospital.equals("safeen hospital") || 
                availableHospital.equals("mercy hospital") ){
                JOptionPane.showMessageDialog(null, "You chose: " + availableHospital, "Output", JOptionPane.INFORMATION_MESSAGE);            
                // getting name and location 
                String name = JOptionPane.showInputDialog(null, "Enter your Name: ", "Input", JOptionPane.QUESTION_MESSAGE);
                String location = JOptionPane.showInputDialog(null, "Enter your Location: ", "Input", JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Thanks Dear, " + name.toUpperCase() + "\n" + "we will send an AMBULANCE as soon as posible to " + 
                                          location.toUpperCase(), "Result", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Thank you for using our project :)", "The end", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else{
                JOptionPane.showMessageDialog(null, "SORRY, WRONG OUTPUT", "Mistake",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }
    else if(ReservationType.equals("reservation")){
            JOptionPane.showMessageDialog(null, "you chose to reserve an appointment with a doctor", "Output", JOptionPane.INFORMATION_MESSAGE);
            // to chose the type of doctor
            String typeOfDoctor = JOptionPane.showInputDialog(null, "What type of doctor you want: " + "\n 1. Respiratory system \n 2. Teeth \n 3. Children"
                                                              + "\n 4. Nerves \n 5. Ear, Nose and Throat \n 6. Intectious \n 7. Skin desies \n 8. Kidney"
                                                              + "\n 9. Bones \n 10. Urologist" + "\n\n" + "Enter the first letter of the type of doctor you"
                                                              + " want", "Output", JOptionPane.INFORMATION_MESSAGE);  
            typeOfDoctor = typeOfDoctor.toLowerCase();
            switch (typeOfDoctor.charAt(0)){
                case 'r': JOptionPane.showMessageDialog(null, "you chose: " + "Respiratory system", "output",JOptionPane.INFORMATION_MESSAGE); break;
                case 't': JOptionPane.showMessageDialog(null, "you chose: " + "Teeth", "output", JOptionPane.INFORMATION_MESSAGE); break;
                case 'c': JOptionPane.showMessageDialog(null, "you chose: " + "Children" , "output", JOptionPane.INFORMATION_MESSAGE); break;
                case 'n': JOptionPane.showMessageDialog(null, "you chose: " + "Nerves", "output", JOptionPane.INFORMATION_MESSAGE); break;
                case 'e': JOptionPane.showMessageDialog(null, "you chose: " + "Ear, Nose and Throat", "output", JOptionPane.INFORMATION_MESSAGE); break;
                case 'i': JOptionPane.showMessageDialog(null, "you chose: " + "Intectious", "output", JOptionPane.INFORMATION_MESSAGE); break;
                case 's': JOptionPane.showMessageDialog(null, "you chose: " + "Skin desies", "output", JOptionPane.INFORMATION_MESSAGE); break;
                case 'k': JOptionPane.showMessageDialog(null, "you chose: " + "Kidney", "output", JOptionPane.INFORMATION_MESSAGE); break;
                case 'b': JOptionPane.showMessageDialog(null, "you chose: " + "Bones", "output", JOptionPane.INFORMATION_MESSAGE); break;
                case 'u': JOptionPane.showMessageDialog(null, "you chose: " + "Urologist", "output", JOptionPane.INFORMATION_MESSAGE); break;
                default: JOptionPane.showMessageDialog(null, "SORRY, WRONG OUTPUT", "Mistake", JOptionPane.ERROR_MESSAGE); return;
            }
            String[][]chooseTime = 
            {
            {"Dr. Ahmed", "Monday: 9:00 - 12:00 AM", " Wednesday: 3:00 - 6:00 PM", "Faruq Medical City"},
            {"Dr. Mohammed", "Saturday: 1:00 - 4:00 PM", "Tuesday: 5:00 - 8:00 PM", "Anwar Sheikha Medical City"},
            {"Dr. Ibrahim", "Sunday: 10:00 AM - 1:00 PM", "Thursday: 7:00 - 9:00 PM", "West eye Hospital"},
            {"dr. Abdulaziz", "Tuesday: 11:00 AM - 2:00 PM", "Wednesday: 4:00 - 7:00 PM", "Children's Hospital"},
            {"dr. Karwan", "Saturday: 12:00 - 3:00 PM", "Monday: 8:00 - 11:00 AM", "Hiwa Hospital"},
            {"dr. Ali", "Sunday: 6:00 - 9:00 PM", "Thursday: 10:00 - 12:00 AM", "Royal Hospital"},
            {"dr. Abdullah", "Saturday: 4:00 - 6:00 PM", "Sunday: 5:00 - :8:00 PM", "Harem Hospital"},
            {"dr. Hiwa", "Monday: 9:00 AM - 1:00 PM", "Tuesday: 5:00 - 7:00 PM", "Asia Hospital"},
            {"dr. Dlshad", "Wednesday: 3:00 - 5:00 AM", "Thursday: 5:00 - 9:00 PM", " Shoresh Hospital"},
            {"dr. Rashid", "Tuesday: 8:00 - 12:00 AM", "Thursday: 1:00 - 3:00 PM", "Azmar Hospital"},
            };
            int row = 0;
            int indexTime = 1;
            String time;
            //to chose the time
                    if(typeOfDoctor.charAt(0) == 'r'){
                        row = 0;
                        time = JOptionPane.showInputDialog(null, "Available Times: 1. " + chooseTime[0][1] + "\t 2. " + chooseTime[0][2] + "\n" +
                                                           "Enter number 1 to choose the first choice" + "\n" + "Enter number 2 to choose the second "
                                                           + "choice", "Input" ,JOptionPane.QUESTION_MESSAGE);
                        int time1 = Integer.parseInt(time);
                        if(time1 == 1)
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][1] + "\n" + 
                                                          "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        else if(time1 == 2){
                            indexTime = 2;
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][2] + "\n" +
                                                          "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        }
                             else{
                                JOptionPane.showMessageDialog(null,"SORRY, WRONG OUTPUT", "Mistake", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                    }
                    if(typeOfDoctor.charAt(0) == 't'){
                        row = 1;
                        time = JOptionPane.showInputDialog(null, "Available Times: 1. " + chooseTime[1][1] + "\t 2. " + chooseTime[1][2] + "\n" +
                                                           "Enter number 1 to choose the first choice" + "\n" + "Enter number 2 to choose the second "
                                                           + "choice", "Input", JOptionPane.QUESTION_MESSAGE);
                        int time1 = Integer.parseInt(time);
                        if(time1 == 1)
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[1][0] + "\n" + "Reserved time: " + chooseTime[1][1] + "\n" +
                                                          "Name of the hospital: " + chooseTime[1][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        else if(time1 == 2){
                            indexTime = 2;
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][2] + "\n" +
                                                          "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                            }
                             else {
                                JOptionPane.showMessageDialog(null, "SORRY , WRONG OUTPUT" , "Mistake",JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                    }
                    if(typeOfDoctor.charAt(0) == 'c'){
                        row = 2;
                        time = JOptionPane.showInputDialog(null, "Available Times: 1. " + chooseTime[2][1] + "\t 2. " + chooseTime[2][2] + "\n" +
                                                           "Enter number 1 to choose the first choice" + "\n" + "Enter number 2 to choose the second "
                                                           + "choice", "Input", JOptionPane.QUESTION_MESSAGE);
                        int time1 = Integer.parseInt(time);
                        if(time1 == 1)
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[2][0] + "\n" +"Reserved time: " + chooseTime[2][1]+ "\n" +
                                                          "Name of the hospital: " + chooseTime[2][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        else if(time1 == 2){
                            indexTime = 2;
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][2]+ "\n" +
                                                          "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                            }
                             else {
                                JOptionPane.showMessageDialog(null, "SORRY , WRONG OUTPUT" , "Mistake",JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                    }                  
                    if(typeOfDoctor.charAt(0) == 'n'){
                        row = 3;
                        time =  JOptionPane.showInputDialog(null, "Available Times: 1. " + chooseTime[3][1] + "\t 2. " + chooseTime[3][2]+ "\n" + 
                                                            "Enter number 1 to choose the first choice" + "\n" + "Enter number 2 to choose the second "
                                                            + "choice", "Input", JOptionPane.QUESTION_MESSAGE);
                        int time1 = Integer.parseInt(time);
                        if(time1 == 1)
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[3][0] + "\n" + "Reserved time: " + chooseTime[3][1] + "\n" +
                                                          "Name of the hospital: " + chooseTime[3][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        else if(time1 == 2){
                            indexTime = 2;
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][2] + "\n" +
                                                          "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                            }
                             else {
                                JOptionPane.showMessageDialog(null, "SORRY, WRONG OUTPUT", "Mistake", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                    }                  
                    if(typeOfDoctor.charAt(0) == 'e'){
                        row = 4;
                        time =  JOptionPane.showInputDialog(null , "Available Times: 1. " + chooseTime[4][1] + "\t 2. " + chooseTime[4][2]+ "\n" +
                                                            "Enter number 1 to choose the first choice" + "\n" + "Enter number 2 to choose the second "
                                                            + "choice", " Input" , JOptionPane.QUESTION_MESSAGE);
                        int time1 = Integer.parseInt(time);
                        if(time1 == 1)
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[4][0] + "\n" + "Reserved time: " + chooseTime[4][1] + "\n" +
                                                          "Name of the hospital: " + chooseTime[4][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        else if(time1 == 2){
                            indexTime = 2;
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][2] + "\n" +
                                                          "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                            }
                             else {
                                JOptionPane.showMessageDialog(null, "SORRY, WRONG OUTPUT", "Mistake", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                    }           
                    if(typeOfDoctor.charAt(0) == 'i'){
                        row = 5;
                        time =  JOptionPane.showInputDialog(null , "Available Times: 1. " + chooseTime[5][1] + "\t 2. " + chooseTime[5][2] + "\n" + 
                                                            "Enter number 1 to choose the first choice" + "\n" + "Enter number 2 to choose the second "
                                                            + "choice", "Input", JOptionPane.QUESTION_MESSAGE);
                        int time1 = Integer.parseInt(time);
                        if(time1 == 1)
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[5][0] + "\n" + "Reserved time: " + chooseTime[5][1]+ "\n" +
                                                          "Name of the hospital: " + chooseTime[5][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        else if(time1 == 2){
                            indexTime = 2;
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][2] + "\n" +
                                                          "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                            }
                             else {
                                JOptionPane.showMessageDialog(null, "SORRY, WRONG OUTPUT" , "Mistake",JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                    }                    
                    if(typeOfDoctor.charAt(0) == 's'){
                        row = 6;
                        time =  JOptionPane.showInputDialog(null, "Available Times: 1. " + chooseTime[6][1] + "\t 2. " + chooseTime[6][2]+ "\n" + 
                                                            "Enter number 1 to choose the first choice" + "\n" + "Enter number 2 to choose the second "
                                                            + "choice", "Input", JOptionPane.QUESTION_MESSAGE);
                        int time1 = Integer.parseInt(time);
                        if(time1 == 1)
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[6][0] + "\n" + "Reserved time: " + chooseTime[6][1] + "\n" +
                                                          "Name of the hospital: " + chooseTime[6][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        else if(time1 == 2){
                            indexTime = 2;
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][2] + "\n" +
                                                         "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                            }
                             else {
                                JOptionPane.showMessageDialog(null, "SORRY, WRONG OUTPUT", "Mistake", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                    }     
                    if(typeOfDoctor.charAt(0) == 'k'){
                        row = 7;
                        time =  JOptionPane.showInputDialog(null, "Available Times: 1. " + chooseTime[7][1] + "\t 2. " + chooseTime[7][2] + "\n" +  
                                                            "Enter number 1 to choose the first choice" + "\n" + "Enter number 2 to choose the second "
                                                            + "choice", "Input", JOptionPane.QUESTION_MESSAGE);
                        int time1 = Integer.parseInt(time);
                        if(time1 == 1)
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[7][0] + "\n" + "Reserved time: " + chooseTime[7][1] + "\n" + 
                                                          "Name of the hospital: " + chooseTime[7][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        else if(time1 == 2){
                            indexTime = 2;
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][2] + "\n" +
                                                          "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                            }
                             else {
                                JOptionPane.showMessageDialog(null, "SORRY, WRONG OUTPUT", "Mistake", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                    }               
                    if(typeOfDoctor.charAt(0) == 'b'){
                        row = 8;
                        time = JOptionPane.showInputDialog(null, "Available Times: 1. " + chooseTime[8][1] + "\t 2. " + chooseTime[8][2]+ "\n" +
                                                           "Enter number 1 to choose the first choice" + "\n" + "Enter number 2 to choose the second "
                                                           + "choice", "Input", JOptionPane.QUESTION_MESSAGE);
                        int time1 = Integer.parseInt(time);
                        if(time1 == 1)
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[8][0] + "\n" + "Reserved time: " + chooseTime[8][1] + "\n" +
                                                          "Name of the hospital: " + chooseTime[8][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        else if(time1 == 2){
                            indexTime = 2;
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][2] + "\n" +
                                                          "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                            }
                             else {
                                JOptionPane.showMessageDialog(null, "SORRY, WRONG OUTPUT" ,"Mistake", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                    }              
                    if(typeOfDoctor.charAt(0) == 'u'){
                        row = 9;
                        time = JOptionPane.showInputDialog(null ,"Available Times: 1. " + chooseTime[9][1] + "\t 2. " + chooseTime[9][2] + "\n" +
                                                           "Enter number 1 to choose the first choice" + "\n" + "Enter number 2 to choose the second "
                                                           + "choice", "Input", JOptionPane.QUESTION_MESSAGE);
                        int time1 = Integer.parseInt(time);
                        if(time1 == 1)
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[9][0] + "\n" +"Reserved time: " + chooseTime[9][1]+ "\n" +
                                                          "Name of the hospital: " + chooseTime[9][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                        else if(time1 == 2){
                            indexTime = 2;
                            JOptionPane.showMessageDialog(null, "Doctor's name: " + chooseTime[0][0] + "\n" + "Reserved time: " + chooseTime[0][2]+ "\n" + 
                                                          "Name of the hospital: " + chooseTime[0][3], "your reservation", JOptionPane.INFORMATION_MESSAGE);
                            }
                             else {
                                JOptionPane.showMessageDialog(null, "SORRY, WRONG OUTPUT", "Mistake", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                    }      
            // in order to enter user information
            String[]info = {"name: ", "gender: male or female", "Phone number: ", "births: ", "email: ", "blood type if you know it: ",
                            "the name of the disease if you have the disease: "};
            String[]result = information(info);        
            JOptionPane.showMessageDialog(null, "Your reservation: " + "\n\n" + "1. Doctor's name: " + chooseTime[row][0] + "\n" + "2. Reserved time: " + 
                                          chooseTime[row][indexTime] + "\n" +"3. Name of the hospital: " + chooseTime[row][3] + "\n\n" + 
                                          "Your information: " + "\n\n" + "1. Your name: " + result[0] + "\n" + "2. your gender: " + result[1] + "\n" +
                                          "3. Phone number: " + result[2] + "\n" + "4. Your births: " + result[3] + "\n" + "5. Your email: " + result[4] +
                                          "\n" + "6. Your blood type: " + result[5] + "\n" + "7. Your illness:e " + result[6] + "\n\n" +
                                          "if you are sure of your reservation and your information click the \"OK\" button below",
                                          "Reservation Confirmation", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Thank you for using our project :)" , "The end",JOptionPane.INFORMATION_MESSAGE);
    }
         else {
            JOptionPane.showMessageDialog(null, "SORRY , WRONG OUTPUT" , "Mistake",JOptionPane.ERROR_MESSAGE);
        }      
    }
    public static String[] information(String info[]){
    int i = 0;
    String[]value = new String[7];
    while(i < 7){
        value[i] =  JOptionPane.showInputDialog(null ,"Enter your " + info[i] , " Complete your reservation" , JOptionPane.QUESTION_MESSAGE );
        i++;
        }
    return value;
    }
}