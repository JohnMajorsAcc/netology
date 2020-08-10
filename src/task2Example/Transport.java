package task2Example;

public enum Transport {

    bus("Автобус"),
    trolleybus("Троллейбус"),
    shuttle_taxi("Маршрутное такси");

    private String translate;

    Transport(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }
}
