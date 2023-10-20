package com.intellekta.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

import static com.intellekta.testing.Import.importUsersToList;

public class TestUrok {


    @Test
    public void importUsersToListNullTest() {
        Import imp = new Import();
        Assertions.assertDoesNotThrow(() -> {
            importUsersToList(null);
        }); // проверика на null
    }
    @Test
    public void importUsersToListReaderFileTest() {
        Import imp = new Import();
        String fileName = "users.txt";
        String result = imp.readFromFile(fileName);
        Assertions.assertEquals("Data from file", result); // проверка чтения из файла
    }
    @Test
    public void importUsersToListWithExceptionTest() { // проверка несуществующего файла
        Import imp = new Import();
        String fileName = "users.txt";
        Assertions.assertThrows(IOException.class, () -> imp.readFromFile(fileName));
    }
}
