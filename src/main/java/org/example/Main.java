package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<TvShow> tvShows = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.println("Please enter a name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Is it a dog? Yes or no:");
            String isDogInput = scanner.nextLine();
            boolean isDog = isDogInput.equalsIgnoreCase("yes");

            animals.add(new Animal(name, isDog));
        }

        System.out.println("TV Show Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.println("Name of the show:");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }

            System.out.println("How many episodes?");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.println("What is the genre?");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(showName, numberOfEpisodes, genre));
        }

        System.out.println("Book Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.println("Title of the book:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Number of pages:");
            int numberOfPages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, numberOfPages, publicationYear));
        }

        System.out.println("What information will be printed? (everything/name)");
        String infoToPrint = scanner.nextLine();

        System.out.println("\nAnimals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nTV Shows:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("\nBooks:");
        if (infoToPrint.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (infoToPrint.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        scanner.close();
    }
}



