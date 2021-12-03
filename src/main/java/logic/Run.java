package logic;

import com.example.gui.Controller;
import javafx.scene.control.Alert;

import java.io.IOException;
import java.util.Set;

public class Run {

    public static void main() throws IOException {
        ParserAPI.connect2();
        ParserAPI.connect();
        Set<String> keySet = ParserAPI.stepSizeList.keySet();
        for (String name : keySet) {
            if (ParserAPI.priceList.containsKey(name)) {
                ParserAPI.dataCryptoList
                        .add(new DataCrypto(
                                name,
                                ParserAPI.priceList.get(name),
                                ParserAPI.stepSizeList.get(name),
                                Controller.getFirst_work_amount(),
                                Controller.getSecond_work_amount(),
                                Controller.getThird_work_amount(),
                                Controller.getFourth_work_amount(),
                                Controller.getFifth_work_amount(),
                                Controller.getThrow_limit_to(),
                                Controller.getStop_limit_orders_throw_range(),
                                Controller.getStop_loss_steps(),
                                Controller.getTake_profit_steps(),
                                Controller.getScroll_step_turbo(),
                                Controller.getFilled_at(),
                                Controller.getBig_amount(),
                                Controller.getHuge_amount(),
                                Controller.getString_height(),
                                Controller.getSlim_levels_factor(),
                                Controller.getFat_levels_factor(),
                                Controller.getIceberg_suspected_from(),
                                Controller.getIceberg_factor(),
                                Controller.getShow_ticks_from(),
                                Controller.getSum_ticks_per_period(),
                                Controller.getBig_amount_ticks(),
                                Controller.getTicks_weight(),
                                Controller.getCluster_filled_at(),
                                Controller.getPrice_aggregation_factor(),
                                Controller.getMax_amount_zero_digits(),
                                Controller.getTriggering_of_stop_orders(),
                                Controller.getIs_server_stop_orders(),
                                Controller.getAveraging_method(),
                                Controller.getShow_profit_type(),
                                Controller.getFocus_t_spread(),
                                Controller.getRuler_data_type(),
                                Controller.getTicks_style(),
                                Controller.getCluster_style_text(),
                                Controller.getCluster_style_color(),
                                Controller.getTime_frame(),
                                Controller.getPlay_sound_on_trade(),
                                Controller.getPlay_big_amount(),
                                Controller.getPlay_huge_amount(),
                                Controller.getPlay_iceberg_orders(),
                                Controller.getFind_iceberg_orders(),
                                Controller.getAuto_scroll(),
                                Controller.getPlay_user_signal_price_levels(),
                                Controller.getHide_filtered_ticks(),
                                Controller.getTicks_play_big_amount(),
                                Controller.getShow_cluster_panel(),
                                Controller.getReduce_amount_thousands(),
                                Controller.getShow_additive_cursor()));
            }
        }
        WriteSettings.startWrite();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText("Данные успешно записаны!");
        alert.showAndWait();
    }

}
