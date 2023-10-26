public class serviceProvider {

    private String voiceTechnology;
    private String dataTechnology;

    public serviceProvider(String voiceTechnology, String dataTechnology) {
        this.voiceTechnology = voiceTechnology;
        this.dataTechnology = dataTechnology;

    }

    public String getVoiceTechnology() {
        return voiceTechnology;
    }

    public void setVoiceTechnology(String voiceTechnology) {
        this.voiceTechnology = voiceTechnology;

    }

    public String getDataTechnology() {
        return dataTechnology;
    }

    public void setDataTechnology(String dataTechnology) {
        this.dataTechnology = dataTechnology;
    }
}

