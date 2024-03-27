package com.sample.CheckingExample;

public class TextEditor {

    private CheckSpelling check;

    public TextEditor(CheckSpelling check){
        this.check = check;
    }

    public void texting(){
        if(check != null){
            CheckSpelling.spellCheck();
        }
        else{
            System.out.println("not checking");
        }
    }

    
}
