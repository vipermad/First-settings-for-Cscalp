package com.example.gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class Controller implements Initializable {
    @FXML
    private Spinner<Integer> First_WorkAmount;
    private static int first_work_amount = 1000;
    @FXML
    private Spinner<Integer> Second_WorkAmount;
    private static int second_work_amount = 2000;
    @FXML
    private Spinner<Integer> Third_WorkAmount;
    private static int third_work_amount = 3000;
    @FXML
    private Spinner<Integer> Fourth_WorkAmount;
    private static int fourth_work_amount = 4000;
    @FXML
    private Spinner<Integer> Fifth_WorkAmount;
    private static int fifth_work_amount = 5000;
    @FXML
    private Spinner<Integer> ThrowLimitTo;
    private static int throw_limit_to = 100;
    @FXML
    private Spinner<Integer> StopLimitOrdersThrowRange;
    private static int stop_limit_orders_throw_range = 0;
    @FXML
    private Spinner<Integer> StopLoss_Steps;
    private static int stop_loss_steps = 0;
    @FXML
    private Spinner<Integer> TakeProfit_Steps;
    private static int take_profit_steps = 0;
    @FXML
    private Spinner<Integer> ScrollStepTurbo;
    private static int scroll_step_turbo = 100;
    @FXML
    private Spinner<Integer> FilledAt;
    private static int filled_at = 10000;
    @FXML
    private Spinner<Integer> BigAmount;
    private static int big_amount = 10000;
    @FXML
    private Spinner<Integer> HugeAmount;
    private static int huge_amount = 10000;
    @FXML
    private Spinner<Integer> StringHeight;
    private static int string_height = 11;
    @FXML
    private Spinner<Integer> SlimLevelsFactor;
    private static int slim_levels_factor = 10;
    @FXML
    private Spinner<Integer> FatLevelsFactor;
    private static int fat_levels_factor = 50;
    @FXML
    private Spinner<Integer> IcebergSuspectedFrom;
    private static int iceberg_suspected_from = 999999;
    @FXML
    private Spinner<Integer> IcebergFactor;
    private static int iceberg_factor = 2;
    @FXML
    private Spinner<Integer> ShowTicksFrom;
    private static int show_ticks_from = 0;
    @FXML
    private Spinner<Integer> SumTicks_Period;
    private static int sum_ticks_per_period = 0;
    @FXML
    private Spinner<Integer> BigAmountTicks;
    private static int big_amount_ticks = 999999;
    @FXML
    private Spinner<Integer> TicksWeight;
    private static int ticks_weight = 1;
    @FXML
    private Spinner<Integer> ClusterFilledAt;
    private static int cluster_filled_at = 10000;
    @FXML
    private Spinner<Integer> PriceAggregationFactor;
    private static int price_aggregation_factor = 1;
    @FXML
    private Spinner<Integer> MaxAmountZeroDigits;
    private static int max_amount_zero_digits = 4;


    @FXML
    private ComboBox<String> TriggeringOfStopOrders;
    private static String triggering_of_stop_orders = "По сделкам";
    @FXML
    private ComboBox<String> IsServerStopOrders;
    private static String is_server_stop_orders = "В приложении";
    @FXML
    private ComboBox<String> AveragingMethod;
    private static String averaging_method = "От первой сделки";
    @FXML
    private ComboBox<String> ShowProfitType;
    private static String show_profit_type = "Проценты";
    @FXML
    private ComboBox<String> Focus_TSpreadFTick;
    private static String focus_t_spread = "По лучшим ценам";
    @FXML
    private ComboBox<String> RulerDataType;
    private static String ruler_data_type = "Проценты";
    @FXML
    private ComboBox<String> TicksStyle;
    private static String ticks_style = "Точки и линии";
    @FXML
    private ComboBox<String> ClusterStyleText;
    private static String cluster_style_text = "Сумма покупок и продаж";
    @FXML
    private ComboBox<String> ClusterStyleColor;
    private static String cluster_style_color = "Баланс светлый";
    @FXML
    private ComboBox<String> TimeFrame;
    private static String time_frame = "5m";


    @FXML
    private CheckBox PlaySoundOnTrade;
    private static String play_sound_on_trade = "False";
    @FXML
    private CheckBox PlayBigAmount;
    private static String play_big_amount= "False";
    @FXML
    private CheckBox PlayHugeAmount;
    private static String play_huge_amount= "False";
    @FXML
    private CheckBox PlayIcebergOrders;
    private static String play_iceberg_orders= "False";
    @FXML
    private CheckBox FindIcebergOrders;
    private static String find_iceberg_orders= "False";
    @FXML
    private CheckBox AutoScroll;
    private static String auto_scroll= "False";
    @FXML
    private CheckBox PlayUserSignalPriceLevels;
    private static String play_user_signal_price_levels= "False";
    @FXML
    private CheckBox HideFilteredTicks;
    private static String hide_filtered_ticks= "False";
    @FXML
    private CheckBox TicksPlayBigAmount;
    private static String ticks_play_big_amount= "False";
    @FXML
    private CheckBox ShowClusterPanel;
    private static String show_cluster_panel= "False";
    @FXML
    private CheckBox ReduceAmountThousands;
    private static String reduce_amount_thousands= "False";
    @FXML
    private CheckBox ShowAdditiveCursor;
    private static String show_additive_cursor= "False";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        SpinnerValueFactory<Integer> firstWorkAmount = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        firstWorkAmount.setValue(1000);
        First_WorkAmount.setValueFactory(firstWorkAmount);
        First_WorkAmount.setEditable(true);
        First_WorkAmount.valueProperty().addListener(
                (observableValue, integer, t1) -> first_work_amount = First_WorkAmount.getValue());

        SpinnerValueFactory<Integer> secondWorkAmount = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        secondWorkAmount.setValue(2000);
        Second_WorkAmount.setValueFactory(secondWorkAmount);
        Second_WorkAmount.setEditable(true);
        Second_WorkAmount.valueProperty().addListener(
                (observableValue, integer, t1) -> second_work_amount = Second_WorkAmount.getValue());

        SpinnerValueFactory<Integer> thirdWorkAmount = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        thirdWorkAmount.setValue(3000);
        Third_WorkAmount.setValueFactory(thirdWorkAmount);
        Third_WorkAmount.setEditable(true);
        Third_WorkAmount.valueProperty().addListener(
                (observableValue, integer, t1) -> third_work_amount = Third_WorkAmount.getValue());

        SpinnerValueFactory<Integer> fourthWorkAmount = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        fourthWorkAmount.setValue(4000);
        Fourth_WorkAmount.setValueFactory(fourthWorkAmount);
        Fourth_WorkAmount.setEditable(true);
        Fourth_WorkAmount.valueProperty().addListener(
                (observableValue, integer, t1) -> fourth_work_amount = Fourth_WorkAmount.getValue());

        SpinnerValueFactory<Integer> fifthWorkAmount = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        fifthWorkAmount.setValue(5000);
        Fifth_WorkAmount.setValueFactory(fifthWorkAmount);
        Fifth_WorkAmount.setEditable(true);
        Fifth_WorkAmount.valueProperty().addListener(
                (observableValue, integer, t1) -> fourth_work_amount = Fifth_WorkAmount.getValue());

        SpinnerValueFactory<Integer> throwLimitTo = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        throwLimitTo.setValue(100);
        ThrowLimitTo.setValueFactory(throwLimitTo);
        ThrowLimitTo.setEditable(true);
        ThrowLimitTo.valueProperty().addListener(
                (observableValue, integer, t1) -> throw_limit_to = ThrowLimitTo.getValue());

        SpinnerValueFactory<Integer> stopLimitOrdersThrowRande = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        stopLimitOrdersThrowRande.setValue(0);
        StopLimitOrdersThrowRange.setValueFactory(stopLimitOrdersThrowRande);
        StopLimitOrdersThrowRange.setEditable(true);
        StopLimitOrdersThrowRange.valueProperty().addListener(
                (observableValue, integer, t1) -> stop_limit_orders_throw_range = StopLimitOrdersThrowRange.getValue());

        SpinnerValueFactory<Integer> stopLossStep = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        stopLossStep.setValue(0);
        StopLoss_Steps.setValueFactory(stopLossStep);
        StopLoss_Steps.setEditable(true);
        StopLoss_Steps.valueProperty().addListener(
                (observableValue, integer, t1) -> stop_loss_steps = StopLoss_Steps.getValue());

        SpinnerValueFactory<Integer> takeProfitSteps = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        takeProfitSteps.setValue(0);
        TakeProfit_Steps.setValueFactory(takeProfitSteps);
        TakeProfit_Steps.setEditable(true);
        TakeProfit_Steps.valueProperty().addListener(
                (observableValue, integer, t1) -> take_profit_steps = TakeProfit_Steps.getValue());

        SpinnerValueFactory<Integer> scrollStepTurbo = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        scrollStepTurbo.setValue(100);
        ScrollStepTurbo.setValueFactory(scrollStepTurbo);
        ScrollStepTurbo.setEditable(true);
        ScrollStepTurbo.valueProperty().addListener(
                (observableValue, integer, t1) -> scroll_step_turbo = ScrollStepTurbo.getValue());

        SpinnerValueFactory<Integer> filledAt = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        filledAt.setValue(10000);
        FilledAt.setValueFactory(filledAt);
        FilledAt.setEditable(true);
        FilledAt.valueProperty().addListener(
                (observableValue, integer, t1) -> filled_at = FilledAt.getValue());

        SpinnerValueFactory<Integer> bigAmount = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        bigAmount.setValue(10000);
        BigAmount.setValueFactory(bigAmount);
        BigAmount.setEditable(true);
        BigAmount.valueProperty().addListener(
                (observableValue, integer, t1) -> big_amount = BigAmount.getValue());

        SpinnerValueFactory<Integer> hugeAmount = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        hugeAmount.setValue(10000);
        HugeAmount.setValueFactory(hugeAmount);
        HugeAmount.setEditable(true);
        HugeAmount.valueProperty().addListener(
                (observableValue, integer, t1) -> huge_amount = HugeAmount.getValue());

        SpinnerValueFactory<Integer> stringHeight = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        stringHeight.setValue(11);
        StringHeight.setValueFactory(stringHeight);
        StringHeight.setEditable(true);
        StringHeight.valueProperty().addListener(
                (observableValue, integer, t1) -> string_height = StringHeight.getValue());

        SpinnerValueFactory<Integer> slimLeveFactor = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        slimLeveFactor.setValue(10);
        SlimLevelsFactor.setValueFactory(slimLeveFactor);
        SlimLevelsFactor.setEditable(true);
        SlimLevelsFactor.valueProperty().addListener(
                (observableValue, integer, t1) -> slim_levels_factor = SlimLevelsFactor.getValue());

        SpinnerValueFactory<Integer> fatLevelFactor = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        fatLevelFactor.setValue(50);
        FatLevelsFactor.setValueFactory(fatLevelFactor);
        FatLevelsFactor.setEditable(true);
        FatLevelsFactor.valueProperty().addListener(
                (observableValue, integer, t1) -> fat_levels_factor = FatLevelsFactor.getValue());

        SpinnerValueFactory<Integer> icebergSuspectedFrom = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        icebergSuspectedFrom.setValue(999999);
        IcebergSuspectedFrom.setValueFactory(icebergSuspectedFrom);
        IcebergSuspectedFrom.setEditable(true);
        IcebergSuspectedFrom.valueProperty().addListener(
                (observableValue, integer, t1) -> iceberg_suspected_from = IcebergSuspectedFrom.getValue());

        SpinnerValueFactory<Integer> icebergFactor = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        icebergFactor.setValue(2);
        IcebergFactor.setValueFactory(icebergFactor);
        IcebergFactor.setEditable(true);
        IcebergFactor.valueProperty().addListener(
                (observableValue, integer, t1) -> iceberg_factor = IcebergFactor.getValue());

        SpinnerValueFactory<Integer> showTicksFrom = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        showTicksFrom.setValue(0);
        ShowTicksFrom.setValueFactory(showTicksFrom);
        ShowTicksFrom.setEditable(true);
        ShowTicksFrom.valueProperty().addListener(
                (observableValue, integer, t1) -> show_ticks_from = ShowTicksFrom.getValue());

        SpinnerValueFactory<Integer> sumTicksPeriod = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        sumTicksPeriod.setValue(0);
        SumTicks_Period.setValueFactory(sumTicksPeriod);
        SumTicks_Period.setEditable(true);
        SumTicks_Period.valueProperty().addListener(
                (observableValue, integer, t1) -> sum_ticks_per_period = SumTicks_Period.getValue());

        SpinnerValueFactory<Integer> bigAmountTicks = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        bigAmountTicks.setValue(999999);
        BigAmountTicks.setValueFactory(bigAmountTicks);
        BigAmountTicks.setEditable(true);
        BigAmountTicks.valueProperty().addListener(
                (observableValue, integer, t1) -> big_amount_ticks = BigAmountTicks.getValue());

        SpinnerValueFactory<Integer> ticksWeight = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        ticksWeight.setValue(1);
        TicksWeight.setValueFactory(ticksWeight);
        TicksWeight.setEditable(true);
        TicksWeight.valueProperty().addListener(
                (observableValue, integer, t1) -> ticks_weight = TicksWeight.getValue());

        SpinnerValueFactory<Integer> clusterFilledAt = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        clusterFilledAt.setValue(10000);
        ClusterFilledAt.setValueFactory(clusterFilledAt);
        ClusterFilledAt.setEditable(true);
        ClusterFilledAt.valueProperty().addListener(
                (observableValue, integer, t1) -> cluster_filled_at = ClusterFilledAt.getValue());

        SpinnerValueFactory<Integer> priceAggregationFactor = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        priceAggregationFactor.setValue(1);
        PriceAggregationFactor.setValueFactory(priceAggregationFactor);
        PriceAggregationFactor.setEditable(true);
        PriceAggregationFactor.valueProperty().addListener(
                (observableValue, integer, t1) -> price_aggregation_factor = PriceAggregationFactor.getValue());

        SpinnerValueFactory<Integer> maxAmountZeroDigits = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 999999999);
        maxAmountZeroDigits.setValue(4);
        MaxAmountZeroDigits.setValueFactory(maxAmountZeroDigits);
        MaxAmountZeroDigits.setEditable(true);
        MaxAmountZeroDigits.valueProperty().addListener(
                (observableValue, integer, t1) -> max_amount_zero_digits = MaxAmountZeroDigits.getValue());



        TriggeringOfStopOrders.setValue("По сделкам");
        TriggeringOfStopOrders.getItems().add("По сделкам");
        TriggeringOfStopOrders.valueProperty().addListener((observableValue, s, t1) -> triggering_of_stop_orders = TriggeringOfStopOrders.getValue());

        IsServerStopOrders.setValue("В приложении");
        IsServerStopOrders.getItems().add("В приложении");
        IsServerStopOrders.getItems().add("На сервере");
        IsServerStopOrders.valueProperty().addListener((observableValue, s, t1) -> is_server_stop_orders = IsServerStopOrders.getValue().equals("В приложении")? "False": "True");

        AveragingMethod.setValue("От первой сделки");
        AveragingMethod.getItems().add("От первой сделки");
        AveragingMethod.getItems().add("По версии сервера");
        AveragingMethod.getItems().add("От последней сделки");
        AveragingMethod.valueProperty().addListener((observableValue, s, t1) ->  averaging_method = switch(AveragingMethod.getValue()){
            case "От первой сделки" -> "FIFO";
            case "По версии сервера" -> "Dispatcher";
            case "От последней сделки" -> "LIFO";
            default -> throw new IllegalStateException("Unexpected value: " + AveragingMethod.getValue());
        });

        ShowProfitType.setValue("Проценты");
        ShowProfitType.getItems().add("Пункты");
        ShowProfitType.getItems().add("Пункты * объем");
        ShowProfitType.getItems().add("Проценты");
        ShowProfitType.valueProperty().addListener((observableValue, s, t1) -> show_profit_type = switch(ShowProfitType.getValue()){
            case "Пункты" -> "0";
            case "Пункты * объем" -> "1";
            case "Проценты" -> "2";
            default -> throw new IllegalStateException("Unexpected value: " + ShowProfitType.getValue());
        });

        Focus_TSpreadFTick.setValue("По лучшим ценам");
        Focus_TSpreadFTick.getItems().add("По лучшим ценам");
        Focus_TSpreadFTick.getItems().add("По сделкам");
        Focus_TSpreadFTick.valueProperty().addListener((observableValue, s, t1) -> focus_t_spread = Focus_TSpreadFTick.getValue().equals("По сделкам")? "False": "True");

        RulerDataType.setValue("Проценты");
        RulerDataType.getItems().add("Нет");
        RulerDataType.getItems().add("Пункты");
        RulerDataType.getItems().add("Проценты");
        RulerDataType.valueProperty().addListener((observableValue, s, t1) -> ruler_data_type = switch(RulerDataType.getValue()){
            case "Нет" -> "0";
            case "Пункты" -> "1";
            case "Проценты" -> "2";
            default -> throw new IllegalStateException("Unexpected value: " + RulerDataType.getValue());
        });

        TicksStyle.setValue("Точки и линии");
        TicksStyle.getItems().add("Точки");
        TicksStyle.getItems().add("Линии");
        TicksStyle.getItems().add("Точки и линии");
        TicksStyle.valueProperty().addListener((observableValue, s, t1) -> ticks_style = switch(TicksStyle.getValue()){
            case "Точки" -> "Dots";
            case "Линии" -> "Lines";
            case "Точки и линии" -> "DotsLines";
            default -> throw new IllegalStateException("Unexpected value: " + TicksStyle.getValue());
        });

        ClusterStyleText.setValue("Сумма покупок и продаж");
        ClusterStyleText.getItems().add("Сумма покупок и продаж");
        ClusterStyleText.getItems().add("Разница покупок и продаж");
        ClusterStyleText.getItems().add("Продажи х покупки");
        ClusterStyleText.valueProperty().addListener((observableValue, s, t1) -> cluster_style_text = switch(ClusterStyleText.getValue()){
            case "Сумма покупок и продаж" -> "Summ";
            case "Разница покупок и продаж" -> "Delta1";
            case "Продажи х покупки" -> "Delta2";
            default -> throw new IllegalStateException("Unexpected value: " + ClusterStyleText.getValue());
        });

        ClusterStyleColor.setValue("Баланс светлый");
        ClusterStyleColor.getItems().add("Баланс светлый");
        ClusterStyleColor.getItems().add("Баланс темный");
        ClusterStyleColor.getItems().add("Смещение цветов");
        ClusterStyleColor.valueProperty().addListener((observableValue, s, t1) -> cluster_style_color = switch(ClusterStyleColor.getValue()){
            case "Баланс светлый" -> "WhiteBalance";
            case "Баланс темный" -> "BlackBalance";
            case "Смещение цветов" -> "Mix";
            default -> throw new IllegalStateException("Unexpected value: " + ClusterStyleColor.getValue());
        });

        TimeFrame.setValue("5m");
        TimeFrame.getItems().add("1m");
        TimeFrame.getItems().add("5m");
        TimeFrame.getItems().add("10m");
        TimeFrame.getItems().add("15m");
        TimeFrame.getItems().add("30m");
        TimeFrame.getItems().add("1h");
        TimeFrame.getItems().add("1d");
        TimeFrame.valueProperty().addListener((observableValue, s, t1) -> time_frame = switch(TimeFrame.getValue()){
            case "1m" -> "1";
            case "5m" -> "5";
            case "10m" -> "10";
            case "15m" -> "15";
            case "30m" -> "30";
            case "1h" -> "60";
            case "1d" -> "1440";
            default -> throw new IllegalStateException("Unexpected value: " + TimeFrame.getValue());
        });



    }

    public void close(){
        System.exit(0);
    }
    public void  save() throws IOException {
        logic.Run.main();
    }

    public void changePlayBigAmount () {
        if (PlayBigAmount.isSelected()){
            play_big_amount = "True";
        }else{
            play_big_amount = "False";
        }
    }
    public void changePlaySoundOnTrade () {
        if (PlaySoundOnTrade.isSelected()){
            play_sound_on_trade = "True";
        }else{
            play_sound_on_trade = "False";
        }
    }
    public void changePlayHugeAmount () {
        if (PlayHugeAmount.isSelected()){
            play_huge_amount = "True";
        }else{
            play_huge_amount = "False";
        }
    }
    public void changePlayIcebergOrders () {
        if (PlayIcebergOrders.isSelected()){
            play_iceberg_orders = "True";
        }else{
            play_iceberg_orders = "False";
        }
    }
    public void changeFindIcebergOrders () {
        if (FindIcebergOrders.isSelected()){
            find_iceberg_orders = "True";
        }else{
            find_iceberg_orders = "False";
        }
    }
    public void changeAutoScroll () {
        if (AutoScroll.isSelected()){
            auto_scroll = "True";
        }else{
            auto_scroll = "False";
        }
    }
    public void changePlayUserSignalPriceLevels () {
        if (PlayUserSignalPriceLevels.isSelected()){
            play_user_signal_price_levels = "True";
        }else{
            play_user_signal_price_levels = "False";
        }
    }
    public void changeHideFilteredTicks () {
        if (HideFilteredTicks.isSelected()){
            hide_filtered_ticks = "True";
        }else{
            hide_filtered_ticks = "False";
        }
    }
    public void changeTicksPlayBigAmount () {
        if (TicksPlayBigAmount.isSelected()){
            ticks_play_big_amount = "True";
        }else{
            ticks_play_big_amount = "False";
        }
    }
    public void changeShowClusterPanel () {
        if (ShowClusterPanel.isSelected()){
            show_cluster_panel = "True";
        }else{
            show_cluster_panel = "False";
        }
    }
    public void changeReduceAmountThousands () {
        if (ReduceAmountThousands.isSelected()){
            reduce_amount_thousands = "True";
        }else{
            reduce_amount_thousands = "False";
        }
    }
    public void changeShowAdditiveCursor () {
        if (ShowAdditiveCursor.isSelected()){
            show_additive_cursor = "True";
        }else{
            show_additive_cursor = "False";
        }
    }

    public static int getFirst_work_amount() {
        return first_work_amount;
    }

    public static int getSecond_work_amount() {
        return second_work_amount;
    }

    public static int getThird_work_amount() {
        return third_work_amount;
    }

    public static int getFourth_work_amount() {
        return fourth_work_amount;
    }

    public static int getFifth_work_amount() {
        return fifth_work_amount;
    }

    public static int getThrow_limit_to() {
        return throw_limit_to;
    }

    public static int getStop_limit_orders_throw_range() {
        return stop_limit_orders_throw_range;
    }

    public static int getStop_loss_steps() {
        return stop_loss_steps;
    }

    public static int getTake_profit_steps() {
        return take_profit_steps;
    }

    public static int getScroll_step_turbo() {
        return scroll_step_turbo;
    }

    public static int getFilled_at() {
        return filled_at;
    }

    public static int getBig_amount() {
        return big_amount;
    }

    public static int getHuge_amount() {
        return huge_amount;
    }

    public static int getString_height() {
        return string_height;
    }

    public static int getSlim_levels_factor() {
        return slim_levels_factor;
    }

    public static int getFat_levels_factor() {
        return fat_levels_factor;
    }

    public static int getIceberg_suspected_from() {
        return iceberg_suspected_from;
    }

    public static int getIceberg_factor() {
        return iceberg_factor;
    }

    public static int getShow_ticks_from() {
        return show_ticks_from;
    }

    public static int getSum_ticks_per_period() {
        return sum_ticks_per_period;
    }

    public static int getBig_amount_ticks() {
        return big_amount_ticks;
    }

    public static int getTicks_weight() {
        return ticks_weight;
    }

    public static int getCluster_filled_at() {
        return cluster_filled_at;
    }

    public static int getPrice_aggregation_factor() {
        return price_aggregation_factor;
    }

    public static int getMax_amount_zero_digits() {
        return max_amount_zero_digits;
    }

    public static String getTriggering_of_stop_orders() {
        return triggering_of_stop_orders;
    }

    public static String getIs_server_stop_orders() {
        return is_server_stop_orders;
    }

    public static String getAveraging_method() {
        return averaging_method;
    }

    public static String getShow_profit_type() {
        return show_profit_type;
    }

    public static String getFocus_t_spread() {
        return focus_t_spread;
    }

    public static String getRuler_data_type() {
        return ruler_data_type;
    }

    public static String getTicks_style() {
        return ticks_style;
    }

    public static String getCluster_style_text() {
        return cluster_style_text;
    }

    public static String getCluster_style_color() {
        return cluster_style_color;
    }

    public static String getTime_frame() {
        return time_frame;
    }

    public static String getPlay_sound_on_trade() {
        return play_sound_on_trade;
    }

    public static String getPlay_big_amount() {
        return play_big_amount;
    }

    public static String getPlay_huge_amount() {
        return play_huge_amount;
    }

    public static String getPlay_iceberg_orders() {
        return play_iceberg_orders;
    }

    public static String getFind_iceberg_orders() {
        return find_iceberg_orders;
    }

    public static String getAuto_scroll() {
        return auto_scroll;
    }

    public static String getPlay_user_signal_price_levels() {
        return play_user_signal_price_levels;
    }

    public static String getHide_filtered_ticks() {
        return hide_filtered_ticks;
    }

    public static String getTicks_play_big_amount() {
        return ticks_play_big_amount;
    }

    public static String getShow_cluster_panel() {
        return show_cluster_panel;
    }

    public static String getReduce_amount_thousands() {
        return reduce_amount_thousands;
    }

    public static String getShow_additive_cursor() {
        return show_additive_cursor;
    }

    @Override
    public String toString() {
        return "com.example.gui.Controller{" +
                "first_work_amount=" + first_work_amount +
                ", second_work_amount=" + second_work_amount +
                ", third_work_amount=" + third_work_amount +
                ", fourth_work_amount=" + fourth_work_amount +
                ", fifth_work_amount=" + fifth_work_amount +
                ", throw_limit_to=" + throw_limit_to +
                ", stop_limit_orders_throw_range=" + stop_limit_orders_throw_range +
                ", stop_loss_steps=" + stop_loss_steps +
                ", take_profit_steps=" + take_profit_steps +
                ", scroll_step_turbo=" + scroll_step_turbo +
                ", filled_at=" + filled_at +
                ", big_amount=" + big_amount +
                ", huge_amount=" + huge_amount +
                ", string_height=" + string_height +
                ", slim_levels_factor=" + slim_levels_factor +
                ", fat_levels_factor=" + fat_levels_factor +
                ", iceberg_suspected_from=" + iceberg_suspected_from +
                ", iceberg_factor=" + iceberg_factor +
                ", show_ticks_from=" + show_ticks_from +
                ", sum_ticks_per_period=" + sum_ticks_per_period +
                ", big_amount_ticks=" + big_amount_ticks +
                ", ticks_weight=" + ticks_weight +
                ", cluster_filled_at=" + cluster_filled_at +
                ", price_aggregation_factor=" + price_aggregation_factor +
                ", max_amount_zero_digits=" + max_amount_zero_digits +
                '}';
    }
}
