package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

        public class County extends DataSupport {
            private int id ;
            private String countryName;
            private String weatherId ;
            private int cityId;

            public void setCityId(int cityId) {
                this.cityId = cityId;
            }

            public void setWeatherId(String weatherId) {

                this.weatherId = weatherId;
            }

            public void setCountryName(String countryName) {

                this.countryName = countryName;
            }

            public void setId(int id) {

                this.id = id;
            }

            public int getCityId() {

                return cityId;
            }

            public String getWeatherId() {

                return weatherId;
            }

            public String getCountryName() {

                return countryName;
            }

            public int getId() {

                return id;
            }
        }
