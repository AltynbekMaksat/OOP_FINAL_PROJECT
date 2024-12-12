package main;

import dll.ReaderWriter;
import models.Teacher;
import models.User;

public class TestReaderWriter {

    public static void main(String[] args) {
        // Создаем объект Teacher
        User teacher = new Teacher("max", "54321");
        String filePath = "/Users/maksat/git/OOP_FINAL_PROJECT5/src/data/teacher.txt";

        // Тестируем сериализацию
        boolean isSerialized = ReaderWriter.serialize(teacher, filePath);
        if (isSerialized) {
            System.out.println("Object serialized successfully!");
        } else {
            System.err.println("Failed to serialize the object.");
        }

        // Тестируем десериализацию
        Object deserialized = ReaderWriter.deserialize(filePath);
        if (deserialized instanceof User) {
            User deserializedUser = (User) deserialized;
            System.out.println("Deserialized object: " + deserializedUser);
        } else {
            System.err.println("Failed to deserialize the object.");
        }
    }
}
