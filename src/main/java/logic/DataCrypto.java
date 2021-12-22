package logic;


public class DataCrypto {

  private String nameCrypto;
  private double price;
  private double first_work_amount;
  private double second_work_amount;
  private double third_work_amount;
  private double fourth_work_amount;
  private double fifth_work_amount;
  private int throw_limit_to;
  private int stop_limit_orders_throw_range;
  private int stop_loss_steps;
  private int take_profit_steps;
  private int scroll_step_turbo;
  private int filled_at;
  private int big_amount;
  private int huge_amount;
  private int string_height;
  private int slim_levels_factor;
  private int fat_levels_factor;
  private int iceberg_suspected_from;
  private int iceberg_factor;
  private int show_ticks_from;
  private int sum_ticks_per_period;
  private int big_amount_ticks;
  private int ticks_weight;
  private int cluster_filled_at;
  private int price_aggregation_factor;
  private int max_amount_zero_digits;
  private String triggering_of_stop_orders;
  private String is_server_stop_orders;
  private String averaging_method;
  private String show_profit_type;
  private String focus_t_spread;
  private String ruler_data_type;
  private String ticks_style;
  private String cluster_style_text;
  private String cluster_style_color;
  private String time_frame;
  private String play_sound_on_trade;
  private String play_big_amount;
  private String play_huge_amount;
  private String play_iceberg_orders;
  private String find_iceberg_orders;
  private String auto_scroll;
  private String play_user_signal_price_levels;
  private String hide_filtered_ticks;
  private String ticks_play_big_amount;
  private String show_cluster_panel;
  private String reduce_amount_thousands;
  private String show_additive_cursor;
  private double stepSize;


  public DataCrypto(
      String nameCrypto,
      double price,
      double stepSize,
      int first_work_amount,
      int second_work_amount,
      int third_work_amount,
      int fourth_work_amount,
      int fifth_work_amount,
      int throw_limit_to,
      int stop_limit_orders_throw_range,
      int stop_loss_steps,
      int take_profit_steps,
      int scroll_step_turbo,
      int filled_at,
      int big_amount,
      int huge_amount,
      int string_height,
      int slim_levels_factor,
      int fat_levels_factor,
      int iceberg_suspected_from,
      int iceberg_factor,
      int show_ticks_from,
      int sum_ticks_per_period,
      int big_amount_ticks,
      int ticks_weight,
      int cluster_filled_at,
      int price_aggregation_factor,
      int max_amount_zero_digits,
      String triggering_of_stop_orders,
      String is_server_stop_orders,
      String averaging_method,
      String show_profit_type,
      String focus_t_spread,
      String ruler_data_type,
      String ticks_style,
      String cluster_style_text,
      String cluster_style_color,
      String time_frame,
      String play_sound_on_trade,
      String play_big_amount,
      String play_huge_amount,
      String play_iceberg_orders,
      String find_iceberg_orders,
      String auto_scroll,
      String play_user_signal_price_levels,
      String hide_filtered_ticks,
      String ticks_play_big_amount,
      String show_cluster_panel,
      String reduce_amount_thousands,
      String show_additive_cursor) {
    this.nameCrypto = nameCrypto;
    this.price = price;
    this.throw_limit_to = throw_limit_to;
    this.stop_limit_orders_throw_range = stop_limit_orders_throw_range;
    this.stop_loss_steps = stop_loss_steps;
    this.take_profit_steps = take_profit_steps;
    this.scroll_step_turbo = scroll_step_turbo;
    this.string_height = string_height;
    this.slim_levels_factor = slim_levels_factor;
    this.fat_levels_factor = fat_levels_factor;
    this.iceberg_suspected_from = iceberg_suspected_from;
    this.iceberg_factor = iceberg_factor;
    this.show_ticks_from = show_ticks_from;
    this.sum_ticks_per_period = sum_ticks_per_period;
    this.big_amount_ticks = big_amount_ticks;
    this.ticks_weight = ticks_weight;
    this.price_aggregation_factor = price_aggregation_factor;
    this.max_amount_zero_digits = max_amount_zero_digits;
    this.triggering_of_stop_orders = triggering_of_stop_orders;
    this.is_server_stop_orders = is_server_stop_orders;
    this.averaging_method = averaging_method;
    this.show_profit_type = show_profit_type;
    this.focus_t_spread = focus_t_spread;
    this.ruler_data_type = ruler_data_type;
    this.ticks_style = ticks_style;
    this.cluster_style_text = cluster_style_text;
    this.cluster_style_color = cluster_style_color;
    this.time_frame = time_frame;
    this.play_sound_on_trade = play_sound_on_trade;
    this.play_big_amount = play_big_amount;
    this.play_huge_amount = play_huge_amount;
    this.play_iceberg_orders = play_iceberg_orders;
    this.find_iceberg_orders = find_iceberg_orders;
    this.auto_scroll = auto_scroll;
    this.play_user_signal_price_levels = play_user_signal_price_levels;
    this.hide_filtered_ticks = hide_filtered_ticks;
    this.ticks_play_big_amount = ticks_play_big_amount;
    this.show_cluster_panel = show_cluster_panel;
    this.reduce_amount_thousands = reduce_amount_thousands;
    this.show_additive_cursor = show_additive_cursor;
    this.stepSize = stepSize;
    convertToValue(filled_at, big_amount, huge_amount, cluster_filled_at, show_ticks_from);
    if (stepSize == 1) {
      this.first_work_amount = (int) (Math.ceil((first_work_amount/price) * Math.pow(10, 0)) / Math.pow(10, 0));
      this.second_work_amount = (int) (Math.ceil((second_work_amount/price) * Math.pow(10, 0)) / Math.pow(10, 0));
      this.third_work_amount = (int) (Math.ceil((third_work_amount/price) * Math.pow(10, 0)) / Math.pow(10, 0));
      this.fourth_work_amount = (int) (Math.ceil((fourth_work_amount/price) * Math.pow(10, 0)) / Math.pow(10, 0));
      this.fifth_work_amount = (int) (Math.ceil((fifth_work_amount/price) * Math.pow(10, 0)) / Math.pow(10, 0));
    } else {
      String[] splitter = String.valueOf(stepSize).split("\\.");
      int i = splitter[1].length();
      this.first_work_amount =  (Math.ceil((first_work_amount/price) * Math.pow(10, i)) / Math.pow(10, i));
      this.second_work_amount = Math.ceil((second_work_amount/price) * Math.pow(10, i)) / Math.pow(10, i);
      this.third_work_amount = Math.ceil((third_work_amount/price) * Math.pow(10, i)) / Math.pow(10, i);
      this.fourth_work_amount = Math.ceil((fourth_work_amount/price) * Math.pow(10, i)) / Math.pow(10, i);
      this.fifth_work_amount = Math.ceil((fifth_work_amount/price) * Math.pow(10, i)) / Math.pow(10, i);
    }
  }


  public DataCrypto() {
  }

  //Рассчет объемов исходя из цены валюты.
  private void convertToValue(int filledAtInUsd, int bigAmountInUsd, int hugeAmountInUsd,
      int filledAtCluster, int show_ticks_from) {
    this.filled_at = (int) (filledAtInUsd / this.price);
    this.big_amount = (int) (bigAmountInUsd / this.price);
    this.huge_amount = (int) (hugeAmountInUsd / this.price);
    this.cluster_filled_at = (int) (filledAtCluster / this.price);
    this.show_ticks_from = (int) (show_ticks_from / this.price);
  }


  public String getSetting() {
    return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<Settings>\n" +
        "  <DOM>\n" +
        "    <FilledAt Value=\"" + filled_at + "\" />\n" +
        "    <AutoScroll Value=\"" + auto_scroll + "\" />\n" +
        "    <ScrollStepTurbo Value=\"" + scroll_step_turbo + "\" />\n" +
        "    <StringHeight Value=\"" + string_height + "\" />\n" +
        "    <BigAmount Value=\"" + big_amount + "\" />\n" +
        "    <HugeAmount Value=\"" + huge_amount + "\" />\n" +
        "    <PlayBigAmount Value=\"" + play_big_amount + "\" />\n" +
        "    <PlayHugeAmount Value=\"" + play_huge_amount + "\" />\n" +
        "    <RulerDataType Value=\"" + ruler_data_type + "\" />\n" +
        "    <FindIcebergOrders Value=\"" + find_iceberg_orders + "\" />\n" +
        "    <PlayIcebergOrders Value=\"" + play_iceberg_orders + "\" />\n" +
        "    <IcebergSuspectedFrom Value=\"" + iceberg_suspected_from + "\" />\n" +
        "    <IcebergFactor Value=\"" + iceberg_factor + "\" />\n" +
        "    <Focus_TSpreadFTick Value=\"" + focus_t_spread + "\" />\n" +
        "    <FatLevelsFactor Value=\"" + fat_levels_factor + "\" />\n" +
        "    <SlimLevelsFactor Value=\"" + slim_levels_factor + "\" />\n" +
        "    <PanelWidth Value=\"1\" />\n" +
        "    <UserLevels Value=\"\" />\n" +
        "    <UserSignalPriceLevels Value=\"\" />\n" +
        "    <PlayUserSignalPriceLevels Value=\"" + play_user_signal_price_levels + "\" />\n" +
        "  </DOM>\n" +
        "  <TICK_PANEL>\n" +
        "    <ShowTicksFrom Value=\"" + show_ticks_from + "\" />\n" +
        "    <HideFilteredTicks Value=\"" + hide_filtered_ticks + "\" />\n" +
        "    <TicksStyle Value=\"" + ticks_style + "\" />\n" +
        "    <TicksWeight Value=\"" + ticks_weight + "\" />\n" +
        "    <SumTicks_Period Value=\"" + sum_ticks_per_period + "\" />\n" +
        "    <PanelWidth Value=\"1\" />\n" +
        "    <BigAmount Value=\"" + big_amount_ticks + "\" />\n" +
        "    <PlayBigAmount Value=\"" + ticks_play_big_amount + "\" />\n" +
        "  </TICK_PANEL>\n" +
        "  <CLUSTER_PANEL>\n" +
        "    <FilledAt Value=\"" + cluster_filled_at + "\" />\n" +
        "    <ShowClusterPanel Value=\"" + show_cluster_panel + "\" />\n" +
        "    <TimeFrame Value=\"" + time_frame + "\" />\n" +
        "    <GridWidth Value=\"400\" />\n" +
        "    <ClusterStyleText Value=\"" + cluster_style_text + "\" />\n" +
        "    <ClusterStyleColor Value=\"" + cluster_style_color + "\" />\n" +
        "    <PanelWidth Value=\"1\" />\n" +
        "  </CLUSTER_PANEL>\n" +
        "  <COMMON_PANEL>\n" +
        "    <PriceAggregationStep Value=\"1\" />\n" +
        "    <PriceAggregationFactor Value=\"" + price_aggregation_factor + "\" />\n" +
        "    <MaxAmountZeroDigits Value=\"" + max_amount_zero_digits + "\" />\n" +
        "    <ReduceAmountThousands Value=\"" + reduce_amount_thousands + "\" />\n" +
        "    <ShowAdditiveCursor Value=\"" + show_additive_cursor + "\" />\n" +
        "  </COMMON_PANEL>\n" +
        "  <TRADING>\n" +
        "    <First_WorkAmount Value=\"" + first_work_amount + "\" />\n" +
        "    <Second_WorkAmount Value=\"" + second_work_amount + "\" />\n" +
        "    <Third_WorkAmount Value=\"" + third_work_amount + "\" />\n" +
        "    <Fourth_WorkAmount Value=\"" + fourth_work_amount + "\" />\n" +
        "    <Fifth_WorkAmount Value=\"" + fifth_work_amount + "\" />\n" +
        "    <ActiveWorkAmountKey Value=\"1\" />\n" +
        "    <IsWorkAmountInMoneyMode Value=\"False\" />\n" +
        "    <ThrowLimitTo Value=\"" + throw_limit_to + "\" />\n" +
        "    <StopLoss_Steps Value=\"" + stop_loss_steps + "\" />\n" +
        "    <TakeProfit_Steps Value=\"" + take_profit_steps + "\" />\n" +
        "    <StopLimitOrdersThrowRange Value=\"" + stop_limit_orders_throw_range + "\" />\n" +
        "    <StopOrdersThrowRange Value=\"" + stop_limit_orders_throw_range + "\" />\n" +
        "    <IsServerStopOrders Value=\"" + is_server_stop_orders + "\" />\n" +
        "    <StopOrdersMethod_TPricesFTick Value=\"False\" />\n" +
        "    <AveragingMethod Value=\"" + averaging_method + "\" />\n" +
        "    <PlaySoundOnTrade Value=\"" + play_sound_on_trade + "\" />\n" +
        "    <ShowProfitType Value=\"" + show_profit_type + "\" />\n" +
        "  </TRADING>\n" +
        "</Settings>";
  }

  public String getNameCrypto() {
    return nameCrypto;
  }

  public void setNameCrypto(String nameCrypto) {
    this.nameCrypto = nameCrypto;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getFirst_work_amount() {
    return first_work_amount;
  }

  public void setFirst_work_amount(double first_work_amount) {
    this.first_work_amount = first_work_amount;
  }

  public double getSecond_work_amount() {
    return second_work_amount;
  }

  public void setSecond_work_amount(double second_work_amount) {
    this.second_work_amount = second_work_amount;
  }

  public double getThird_work_amount() {
    return third_work_amount;
  }

  public void setThird_work_amount(double third_work_amount) {
    this.third_work_amount = third_work_amount;
  }

  public double getFourth_work_amount() {
    return fourth_work_amount;
  }

  public void setFourth_work_amount(double fourth_work_amount) {
    this.fourth_work_amount = fourth_work_amount;
  }

  public double getFifth_work_amount() {
    return fifth_work_amount;
  }

  public void setFifth_work_amount(double fifth_work_amount) {
    this.fifth_work_amount = fifth_work_amount;
  }

  public int getThrow_limit_to() {
    return throw_limit_to;
  }

  public void setThrow_limit_to(int throw_limit_to) {
    this.throw_limit_to = throw_limit_to;
  }

  public int getStop_limit_orders_throw_range() {
    return stop_limit_orders_throw_range;
  }

  public void setStop_limit_orders_throw_range(int stop_limit_orders_throw_range) {
    this.stop_limit_orders_throw_range = stop_limit_orders_throw_range;
  }

  public int getStop_loss_steps() {
    return stop_loss_steps;
  }

  public void setStop_loss_steps(int stop_loss_steps) {
    this.stop_loss_steps = stop_loss_steps;
  }

  public int getTake_profit_steps() {
    return take_profit_steps;
  }

  public void setTake_profit_steps(int take_profit_steps) {
    this.take_profit_steps = take_profit_steps;
  }

  public int getScroll_step_turbo() {
    return scroll_step_turbo;
  }

  public void setScroll_step_turbo(int scroll_step_turbo) {
    this.scroll_step_turbo = scroll_step_turbo;
  }

  public int getFilled_at() {
    return filled_at;
  }

  public void setFilled_at(int filled_at) {
    this.filled_at = filled_at;
  }

  public int getBig_amount() {
    return big_amount;
  }

  public void setBig_amount(int big_amount) {
    this.big_amount = big_amount;
  }

  public int getHuge_amount() {
    return huge_amount;
  }

  public void setHuge_amount(int huge_amount) {
    this.huge_amount = huge_amount;
  }

  public int getString_height() {
    return string_height;
  }

  public void setString_height(int string_height) {
    this.string_height = string_height;
  }

  public int getSlim_levels_factor() {
    return slim_levels_factor;
  }

  public void setSlim_levels_factor(int slim_levels_factor) {
    this.slim_levels_factor = slim_levels_factor;
  }

  public int getFat_levels_factor() {
    return fat_levels_factor;
  }

  public void setFat_levels_factor(int fat_levels_factor) {
    this.fat_levels_factor = fat_levels_factor;
  }

  public int getIceberg_suspected_from() {
    return iceberg_suspected_from;
  }

  public void setIceberg_suspected_from(int iceberg_suspected_from) {
    this.iceberg_suspected_from = iceberg_suspected_from;
  }

  public int getIceberg_factor() {
    return iceberg_factor;
  }

  public void setIceberg_factor(int iceberg_factor) {
    this.iceberg_factor = iceberg_factor;
  }

  public int getShow_ticks_from() {
    return show_ticks_from;
  }

  public void setShow_ticks_from(int show_ticks_from) {
    this.show_ticks_from = show_ticks_from;
  }

  public int getSum_ticks_per_period() {
    return sum_ticks_per_period;
  }

  public void setSum_ticks_per_period(int sum_ticks_per_period) {
    this.sum_ticks_per_period = sum_ticks_per_period;
  }

  public int getBig_amount_ticks() {
    return big_amount_ticks;
  }

  public void setBig_amount_ticks(int big_amount_ticks) {
    this.big_amount_ticks = big_amount_ticks;
  }

  public int getTicks_weight() {
    return ticks_weight;
  }

  public void setTicks_weight(int ticks_weight) {
    this.ticks_weight = ticks_weight;
  }

  public int getCluster_filled_at() {
    return cluster_filled_at;
  }

  public void setCluster_filled_at(int cluster_filled_at) {
    this.cluster_filled_at = cluster_filled_at;
  }

  public int getPrice_aggregation_factor() {
    return price_aggregation_factor;
  }

  public void setPrice_aggregation_factor(int price_aggregation_factor) {
    this.price_aggregation_factor = price_aggregation_factor;
  }

  public int getMax_amount_zero_digits() {
    return max_amount_zero_digits;
  }

  public void setMax_amount_zero_digits(int max_amount_zero_digits) {
    this.max_amount_zero_digits = max_amount_zero_digits;
  }

  public String getTriggering_of_stop_orders() {
    return triggering_of_stop_orders;
  }

  public void setTriggering_of_stop_orders(String triggering_of_stop_orders) {
    this.triggering_of_stop_orders = triggering_of_stop_orders;
  }

  public String getIs_server_stop_orders() {
    return is_server_stop_orders;
  }

  public void setIs_server_stop_orders(String is_server_stop_orders) {
    this.is_server_stop_orders = is_server_stop_orders;
  }

  public String getAveraging_method() {
    return averaging_method;
  }

  public void setAveraging_method(String averaging_method) {
    this.averaging_method = averaging_method;
  }

  public String getShow_profit_type() {
    return show_profit_type;
  }

  public void setShow_profit_type(String show_profit_type) {
    this.show_profit_type = show_profit_type;
  }

  public String getFocus_t_spread() {
    return focus_t_spread;
  }

  public void setFocus_t_spread(String focus_t_spread) {
    this.focus_t_spread = focus_t_spread;
  }

  public String getRuler_data_type() {
    return ruler_data_type;
  }

  public void setRuler_data_type(String ruler_data_type) {
    this.ruler_data_type = ruler_data_type;
  }

  public String getTicks_style() {
    return ticks_style;
  }

  public void setTicks_style(String ticks_style) {
    this.ticks_style = ticks_style;
  }

  public String getCluster_style_text() {
    return cluster_style_text;
  }

  public void setCluster_style_text(String cluster_style_text) {
    this.cluster_style_text = cluster_style_text;
  }

  public String getCluster_style_color() {
    return cluster_style_color;
  }

  public void setCluster_style_color(String cluster_style_color) {
    this.cluster_style_color = cluster_style_color;
  }

  public String getTime_frame() {
    return time_frame;
  }

  public void setTime_frame(String time_frame) {
    this.time_frame = time_frame;
  }

  public String getPlay_sound_on_trade() {
    return play_sound_on_trade;
  }

  public void setPlay_sound_on_trade(String play_sound_on_trade) {
    this.play_sound_on_trade = play_sound_on_trade;
  }

  public String getPlay_big_amount() {
    return play_big_amount;
  }

  public void setPlay_big_amount(String play_big_amount) {
    this.play_big_amount = play_big_amount;
  }

  public String getPlay_huge_amount() {
    return play_huge_amount;
  }

  public void setPlay_huge_amount(String play_huge_amount) {
    this.play_huge_amount = play_huge_amount;
  }

  public String getPlay_iceberg_orders() {
    return play_iceberg_orders;
  }

  public void setPlay_iceberg_orders(String play_iceberg_orders) {
    this.play_iceberg_orders = play_iceberg_orders;
  }

  public String getFind_iceberg_orders() {
    return find_iceberg_orders;
  }

  public void setFind_iceberg_orders(String find_iceberg_orders) {
    this.find_iceberg_orders = find_iceberg_orders;
  }

  public String getAuto_scroll() {
    return auto_scroll;
  }

  public void setAuto_scroll(String auto_scroll) {
    this.auto_scroll = auto_scroll;
  }

  public String getPlay_user_signal_price_levels() {
    return play_user_signal_price_levels;
  }

  public void setPlay_user_signal_price_levels(String play_user_signal_price_levels) {
    this.play_user_signal_price_levels = play_user_signal_price_levels;
  }

  public String getHide_filtered_ticks() {
    return hide_filtered_ticks;
  }

  public void setHide_filtered_ticks(String hide_filtered_ticks) {
    this.hide_filtered_ticks = hide_filtered_ticks;
  }

  public String getTicks_play_big_amount() {
    return ticks_play_big_amount;
  }

  public void setTicks_play_big_amount(String ticks_play_big_amount) {
    this.ticks_play_big_amount = ticks_play_big_amount;
  }

  public String getShow_cluster_panel() {
    return show_cluster_panel;
  }

  public void setShow_cluster_panel(String show_cluster_panel) {
    this.show_cluster_panel = show_cluster_panel;
  }

  public String getReduce_amount_thousands() {
    return reduce_amount_thousands;
  }

  public void setReduce_amount_thousands(String reduce_amount_thousands) {
    this.reduce_amount_thousands = reduce_amount_thousands;
  }

  public String getShow_additive_cursor() {
    return show_additive_cursor;
  }

  public void setShow_additive_cursor(String show_additive_cursor) {
    this.show_additive_cursor = show_additive_cursor;
  }

  public double getStepSize() {
    return stepSize;
  }

  public void setStepSize(double stepSize) {
    this.stepSize = stepSize;
  }
}

