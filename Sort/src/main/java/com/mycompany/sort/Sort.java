/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quoch
 */
public class Sort {

    public static void main(String[] args) {
        // Đoạn mã minh họa cách sử dụng mergeSort để sắp xếp danh sách sách theo năm xuất bản
        CSVReader csvReader = new CSVReader();
        String filePath = "C:\\Users\\quoch\\OneDrive\\Documents\\NetBeansProjects\\Sort\\books.csv"; // Thay đổi đường dẫn tới file CSV của bạn
        List<Book> books = csvReader.readCSV(filePath);
        
        System.out.println("Before sorting:");
        for (Book book : books) {
            System.out.println(book);
        }

        BookSorter.mergeSort(books, "year");

        System.out.println("\nAfter sorting by year of publication:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
    
class CSVReader {
    
    public CSVReader(){}
    
    public List<Book> readCSV(String filePath) {
        List<Book> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;
            line = br.readLine(); // bỏ qua dòng đầu
            while ((line = br.readLine()) != null && count < 1000) {
                String[] row = line.split("(?<!\\s);(?!\\s)");
                data.add(new Book(row[0].substring(1, row[0].length() - 1),
                        row[1].substring(1, row[1].length() - 1),
                        row[2].substring(1, row[2].length() - 1),
                        Integer.parseInt(row[3].substring(1, row[3].length() - 1)),
                        row[4].substring(1, row[4].length() - 1),
                        row[5].substring(1, row[5].length() - 1),
                        row[6].substring(1, row[6].length() - 1),
                        row[7].substring(1, row[7].length() - 1)));
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace(); // Xử lý ngoại lệ theo nhu cầu của bạn
        }

        return data;
    }
}

class BookSorter {

    public static void mergeSort(List<Book> books, String sortBy) {
        if (books == null || books.size() <= 1) {
            return;
        }

        int middle = books.size() / 2;
        List<Book> left = new ArrayList<>(books.subList(0, middle));
        List<Book> right = new ArrayList<>(books.subList(middle, books.size()));

        mergeSort(left, sortBy);
        mergeSort(right, sortBy);

        merge(books, left, right, sortBy);
    }

    private static void merge(List<Book> books, List<Book> left, List<Book> right, String sortBy) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (compareBooks(left.get(leftIndex), right.get(rightIndex), sortBy) <= 0) {
                books.set(resultIndex++, left.get(leftIndex++));
            } else {
                books.set(resultIndex++, right.get(rightIndex++));
            }
        }
        while (leftIndex < left.size()) {
            books.set(resultIndex++, left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            books.set(resultIndex++, right.get(rightIndex++));
        }
    }

    private static int compareBooks(Book book1, Book book2, String sortBy) {
        switch (sortBy) {
            case "isbn":
                return book1.getIsbn().compareTo(book2.getIsbn());
            case "title":
                return book1.getTitle().compareTo(book2.getTitle());
            case "author":
                return book1.getAuthor().compareTo(book2.getAuthor());
            case "year":
                return Integer.compare(book1.getYearOfPublication(), book2.getYearOfPublication());
            // Add more cases for other fields if needed
            default:
                throw new IllegalArgumentException("Invalid sort criteria: " + sortBy);
        }
    }
}

class Book {
    private String isbn;
    private String title;
    private String author;
    private int yearOfPublication;
    private String publisher;
    private String imageUrlS;
    private String imageUrlM;
    private String imageUrlL;

    // Constructors
    public Book(String isbn, String title, String author, int yearOfPublication, String publisher,
                String imageUrlS, String imageUrlM, String imageUrlL) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
        this.imageUrlS = imageUrlS;
        this.imageUrlM = imageUrlM;
        this.imageUrlL = imageUrlL;
    }
    
    public String getKey(){
        return this.isbn;
    }
    // Getters and Setters (you can generate them automatically in many IDEs)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImageUrlS() {
        return imageUrlS;
    }

    public void setImageUrlS(String imageUrlS) {
        this.imageUrlS = imageUrlS;
    }

    public String getImageUrlM() {
        return imageUrlM;
    }

    public void setImageUrlM(String imageUrlM) {
        this.imageUrlM = imageUrlM;
    }

    public String getImageUrlL() {
        return imageUrlL;
    }

    public void setImageUrlL(String imageUrlL) {
        this.imageUrlL = imageUrlL;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", publisher='" + publisher + '\'' +
                ", imageUrlS='" + imageUrlS + '\'' +
                ", imageUrlM='" + imageUrlM + '\'' +
                ", imageUrlL='" + imageUrlL + '\'' +
                '}';
    }
}