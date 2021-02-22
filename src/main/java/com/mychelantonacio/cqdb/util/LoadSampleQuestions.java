package com.mychelantonacio.cqdb.util;

import com.mychelantonacio.cqdb.models.Question;
import com.mychelantonacio.cqdb.util.enums.CategoryEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadSampleQuestions {

    //sample questions...
    static Question q1 = new Question(1L, "Reverse words in a given string", "Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.",
            "The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.", "2 i.like.this.program.very.much pqr.mno",
            "For each test case, in a new line, output a single line containing the reversed String.", "much.very.program.this.like.i mno.pqr", "1<=T<=100 1<=|S|<=2000", null,
            CategoryEnum.CODING.getCategoryCode());

    static Question q2 = new Question(2L, "Permutations of a given string", "Given a string S. The task is to print all permutations of a given string.",
            "The first line of input contains an integer T, denoting the number of test cases. Each test case contains a single string S in capital letter.", "2 ABC ABSG",
            "For each test case, print all permutations of a given string S with single space and all permutations should be in lexicographically increasing order.",
            "ABC ACB BAC BCA CAB CBA ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA", "1≤T≤10 1≤size of string≤5", null,
            CategoryEnum.CODING.getCategoryCode());

    static Question q3 = new Question(3L, "Longest Palindrome in a String", "Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). " +
            "Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. In case of conflict, return the substring which occurs first ( with the least starting index ).",
            "The first line of input consists number of the testcases. The following T lines consist of a string each.", "1 aaaabbaa", "In each separate line print the longest palindrome of the string given in the respective test case.",
            "aabbaa", "1≤T≤100 1≤String Length≤10^4", "Required Time Complexity O(n^2).",
            CategoryEnum.CODING.getCategoryCode());

    static Question q4 = new Question(4L, "String with Unique Characters", "Implement an algorithm to determine if a string has all unique characters.",
            "A string", "ball", "true or false",
            "false", "1<length<=100", "What if you cannot use additional data structure?",
            CategoryEnum.CODING.getCategoryCode());

    static Question q5 = new Question(5L, "Check String Permutation", "Given two strings, write a method to decide if one is permutation of the other.",
            "A string", "apple", "true or false",
            "papel", "1<length<=100", null,
            CategoryEnum.CODING.getCategoryCode());

    static Question q6 = new Question(6L, "URLify", "Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold additional characters, and that you are given the true length of the string.",
            "a string", "'Mr John Smith      ', 13", "a string with all spaces replaced to '%20'",
            "Mr%20Jhon%20Smith", "1<length<=100", "If implementing in Java, please use character array so that you can perform this operation in place.",
            CategoryEnum.CODING.getCategoryCode());

    static Question q7 = new Question(7L, "Palindrome Permutation", "Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.",
            "a string", "'Tact Coa", "true or false",
            "true ('taco cat', 'atco cta')", "1<length<=100", "The palindrome does not need to be limited to just dictionary words",
            CategoryEnum.CODING.getCategoryCode());

    static Question q8 = new Question(8L, "One Away", "There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.",
            "two strings", "pale, ple", "true or false",
            "true", "1<length<=10", null,
            CategoryEnum.CODING.getCategoryCode());

    static Question q9 = new Question(9L, "String Compression", "Implement a method to perform basic string compression using the counts of repeated characters. For example, the string 'aabcccccaaa' would become 'a2b1c5a3'. If the 'compressed' string would not become smaller than the original string, your method should return the original string.",
            "a string", "aabcccccaaa", "compressed string or input string itself",
            "a2b1c5a3", "1<length<=100", "You can assume the string has only uppercase and lowercase letters (a - z)",
            CategoryEnum.CODING.getCategoryCode());

    static Question q10 = new Question(10L, "Rotate Matrix", "Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees.",
                "NxN matrix", "NXN matrix", "NxN rotated 90 degrees",
            "Same matrix rotated 90 degrees", "2<=N<=10", "Can you do this in place?",
            CategoryEnum.CODING.getCategoryCode());

    static Question q11 = new Question(11L, "Zero Matrix", "Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.",
            "MxN matrix", "MXN matrix", "MXN matrix",
            "MXN matrix", "2<=M<=10 and 2<=N<=10", null,
            CategoryEnum.CODING.getCategoryCode());

    static Question q12 = new Question(12L, "String Rotation", "Given two strings, sl and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (e.g.,'waterbottle' is a rotation of 'erbottlewat')",
            "two strings", "waterbottle", "true or false",
            "erbottlewat", "2<=s1<=20 and 2<=s2<=20", "Assume you have a method 'isSubstring' which checks if one word is a substring of another.",
            CategoryEnum.CODING.getCategoryCode());

    static Question q13 = new Question(13L, "Remove Dups", "Write code to remove duplicates from an unsorted linked list",
            "unsorted linked list", "9->5->4->5", "no duplicated elements in the linked list",
            "9->5->4", "2<=length<=1000", "How would you solve this problem if a temporary buffer is not allowed?",
            CategoryEnum.CODING.getCategoryCode());


    public static List<Question> getSampleQuestions = new ArrayList<>(Arrays.asList(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13));
}


