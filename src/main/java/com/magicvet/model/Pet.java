package main.java.com.magicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Pet {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");


    private String type;
    private String sex;
    private String age;
    private String name;

    private String ownerName;
    private String healthState;
    private final LocalDateTime registrationDate = LocalDateTime.now();

    @Override
    public String toString() {
        return "Pet {"
                + "type = " + type
                + ", sex = " + sex
                + ", age = " + age
                + ", name = " + name
                +", ownerName = " + ownerName
                + ", healthState = " + healthState
                + ", registrationDate = " + registrationDate.format(FORMATTER)
                + "}";
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getHealthState() {
        return healthState;
    }

    public void setHealthState(String healthState) {
        this.healthState = healthState;
    }

    public String getOwnerName() {

        return ownerName;
    }

    public void setOwnerName(String ownerName) {

        this.ownerName = ownerName;
    }


    public LocalDateTime getRegistrationDate() {

        return registrationDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(type, pet.type)
                && Objects.equals(sex, pet.sex)
                && Objects.equals(age, pet.age)
                && Objects.equals(name, pet.name)
                && Objects.equals(ownerName, pet.ownerName)
                && Objects.equals(healthState,pet.healthState)
                && Objects.equals(registrationDate,pet.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, age, name, ownerName, healthState, registrationDate);
    }



    public enum Age {

        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
        SEVEN(7), EIGHT(8), NINE(9), TEN(10), ELEVEN(11), TWELVE(12),
        THIRTEEN(13), FOURTEEN(14), FIFTEEN(15), SIXTEEN(16), SEVENTEEN(17),
        EIGHTEEN(18), NINETEEN(19), TWENTY(20), UNKNOWN(0);
        private final int value;

        Age(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Age fromString(String value) {
            for (Age age : values()) {
                if (age.toString().equalsIgnoreCase(value)) {
                    return age;
                }
            }
            System.out.println(( "Unable to parse value " + value + "'. Using default value: " + UNKNOWN));
            return UNKNOWN;
        }
    }

            public enum HealthState {
                HEALTHY_OR_GETTING_BETTER(1),
                SICK(2),
                SERIOUSLY_ILL(3),
                TERMINAL_STATE(4),
                UNKNOWN(0);

                private final int value;

                HealthState(int value) {
                    this.value = value;
                }

                public int getValue() {
                    return value;
                }

                public static HealthState fromString(String value) {
                    for (HealthState healthState : values()) {
                        if (healthState.toString().equalsIgnoreCase(value)) {
                            return healthState;
                        }
                    }
                    System.out.println("Unable to parse value '" + value + "'. Using default value: " + UNKNOWN);
                    return UNKNOWN;
                }
            }
        }









