package com.company.task331.book;

public class BookMover {

    public void moveToStatus(Book book, Status requestedStatus) {

        if (checkStatus(book.getStatus().ordinal(), requestedStatus.ordinal())) {
            System.out.println("Перемещение " + book.getStatus().getDescription()
                    + " -> " + requestedStatus.getDescription() + " невозможно");
            return;

        } else {
            System.out.println("Статус книги переведен на \"" + requestedStatus.getDescription() + "\"");
            book.setStatus(requestedStatus);
        }
    }

    protected boolean checkStatus(int answerBookStatusNumber, int answerStatusNumber) {
        if ((answerBookStatusNumber == answerStatusNumber)                  // SAME STATUS
                || (answerBookStatusNumber == 1 && answerStatusNumber == 0)      // ARCHIVED -> BORROWED
                || (answerBookStatusNumber == 1 && answerStatusNumber == 3)      // ARCHIVED -> OVERDUED
                || (answerBookStatusNumber == 2 && answerStatusNumber == 3)      // AVAILABLE -> OVERDUED
                || (answerBookStatusNumber == 3 && answerStatusNumber == 0))     // OVERDUED -> BORROWED
        {
            return true;
        } else {
            return false;
        }
    }
};


