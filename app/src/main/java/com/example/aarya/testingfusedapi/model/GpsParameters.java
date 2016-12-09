package com.example.aarya.testingfusedapi.model;

public class GpsParameters {
        private double lat;
        private double lon;
        private String imei;
        private String date_time;
        private float Accurate;
        private String battery;
        private String location;
        private String Panic;
        private String Speed;
        private String Direction;

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public String getImei() {
            return imei;
        }

        public void setImei(String imei) {
            this.imei = imei;
        }

        public String getDate_time() {
            return date_time;
        }

        public void setDate_time(String date_time) {
            this.date_time = date_time;
        }

        public float getAccurate() {
            return Accurate;
        }

        public void setAccurate(float accurate) {
            Accurate = accurate;
        }

        public String getBattery() {
            return battery;
        }

        public void setBattery(String battery) {
            this.battery = battery;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getPanic() {
            return Panic;
        }

        public void setPanic(String panic) {
            Panic = panic;
        }

        public String getSpeed() {
            return Speed;
        }

        public void setSpeed(String speed) {
            Speed = speed;
        }

        public String getDirection() {
            return Direction;
        }

        public void setDirection(String direction) {
            Direction = direction;
        }
    }
//              lat=23.1212&&
//              lon=76.3434&&
//              imei=13231313&&
//              battery=23&&
//              date_time=2016-11-28%2012:46&&
// location=noida%20sector%2062&&
// Panic=false&&
//              Accurate=23.32&&
//              Speed=24&&
// Direction=1
