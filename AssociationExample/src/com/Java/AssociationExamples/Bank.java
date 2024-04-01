
package com.Java.AssociationExamples;

import java.io.*;
import java.util.*;
import java.util.Set;
public class Bank {
    // Attributes of bank
    private String name;

    private Set<Employee> employees;
    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }
