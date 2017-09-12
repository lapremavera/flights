package be.vdab.flights.domain;

    public class Flight {

        private Integer id;
        private String number;

        public Flight(String number) {
            this.number = number;
        }

        public Flight() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }


