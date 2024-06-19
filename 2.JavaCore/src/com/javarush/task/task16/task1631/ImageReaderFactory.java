package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        if (imageTypes == ImageTypes.BMP) {
            return new BmpReader();
        } else if (imageTypes == ImageTypes.JPG) {
            return new JpgReader();
        } else if (imageTypes == ImageTypes.PNG) {
            return new PngReader();
        } else if (imageTypes == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}

//1631
//Вы решили задачу лучше, чем 67% учеников. Вам удалось ее решить с 1 попытки. Среднее количество попыток для этой задачи 3.12. Всего эту задачу решили 31667 учеников.