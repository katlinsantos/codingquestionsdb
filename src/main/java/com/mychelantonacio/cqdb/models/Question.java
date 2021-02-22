package com.mychelantonacio.cqdb.models;


//import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

//@Entity
//@Table(name = "tb_question")
@JsonIgnoreProperties("id")
public class Question implements Serializable {

    //  @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    //@Column( length = 4096 )
    private String task;

    private String input;

    private String exampleInput;

    //@Column( length = 2048 )
    private String output;

    //@Column( length = 2048 )
    private String exampleOutput;

    private String constraints;

    private String note;

    private String category;

    public Question(){}

    public Question(long id, String title, String task, String input, String exampleInput,
                    String output, String exampleOutput, String constraints, String note, String category){
        this.id = id;
        this.title = title;
        this.task = task;
        this.input = input;
        this.exampleInput = exampleInput;
        this.output = output;
        this.exampleOutput = exampleOutput;
        this.constraints = constraints;
        this.note = note;
        this.category = category;
    }

    public Question(String title, String task, String input, String exampleInput,
                    String output, String exampleOutput, String constraints, String note, String category){
        this.title = title;
        this.task = task;
        this.input = input;
        this.exampleInput = exampleInput;
        this.output = output;
        this.exampleOutput = exampleOutput;
        this.constraints = constraints;
        this.note = note;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getExampleInput() {
        return exampleInput;
    }

    public void setExampleInput(String exampleInput) {
        this.exampleInput = exampleInput;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getExampleOutput() {
        return exampleOutput;
    }

    public void setExampleOutput(String exampleOutput) {
        this.exampleOutput = exampleOutput;
    }

    public String getConstraints() {
        return constraints;
    }

    public void setConstraints(String constraints) {
        this.constraints = constraints;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "title " + title + "\ntask " + task + "\ninput " + input + "\nexampleInput " + exampleInput
                + "\noutput " + output + "\nexampleOutput " + exampleOutput + "\nconstraints " + constraints
                + "\nnote " + note + "\ncategory " + category;
    }
}