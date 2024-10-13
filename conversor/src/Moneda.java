public record Moneda(String base_code,
                      String target_code,
                      String time_next_update_utc,
                      double conversion_rate,
                      double conversion_result){


    @Override
    public String toString() {
        return " El valor de "+ (conversion_result/conversion_rate) + "["+ base_code +"] corresponde al valor final de "+conversion_result+" ["+ target_code+"]";
    }
}