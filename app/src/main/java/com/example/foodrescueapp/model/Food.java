package com.example.foodrescueapp.model;

import android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;

public class Food {
    // Instance variables
    private int id;
    private String name, desc, pickUpTimes, quantity, location, date;
    private Bitmap image;

    // Constructors
    public Food(int id, Bitmap image, String name, String description, String date,
                String pickUpTimes, String quantity, String location) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.desc = description;
        this.date = date;
        this.pickUpTimes = pickUpTimes;
        this.quantity = quantity;
        this.location = location;
    }

    public Food(Bitmap image, String name, String description, String date,
                String pickUpTimes, String quantity, String location) {
        this.image = image;
        this.name = name;
        this.desc = description;
        this.date = date;
        this.pickUpTimes = pickUpTimes;
        this.quantity = quantity;
        this.location = location;
    }

    // Methods
    public byte[] getImageBlob() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        this.image.compress(Bitmap.CompressFormat.PNG, 0, outputStream);

        return outputStream.toByteArray();
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public Bitmap getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDate() {
        return this.date;
    }

    public String getPickUpTimes() {
        return this.pickUpTimes;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public String getLocation() {
        return this.location;
    }
}
