package com;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author 王宇
 * @since 2019/7/25 11:12
 */
public class Test {
  public static void main(String[] args) {

    // 用于sampleInfoDtoList去重
    List<SampleInfoDto> sampleInfoDtoListNew = new ArrayList<>();

//    SampleInfoDto dto = new SampleInfoDto();
//    dto.setItemModel("a");
//    SampleInfoDto dto1 = new SampleInfoDto();
//    dto.setItemModel("a");
//    SampleInfoDto dto2 = new SampleInfoDto();
//    dto.setItemModel("b");
//    SampleInfoDto dto3 = new SampleInfoDto();
//    dto.setItemModel("d");
//    SampleInfoDto dto4 = new SampleInfoDto();
//    dto.setItemModel("ff");
//    SampleInfoDto dto5 = new SampleInfoDto();
//    dto.setItemModel("ff");
//    sampleInfoDtoListNew.add(dto);
//
    for (int i = 0; i < 100; i++) {
      SampleInfoDto dto = new SampleInfoDto();
      Integer number = new Random().nextInt(10) + 1;
      dto.setItemModel(number.toString());
      sampleInfoDtoListNew.add(dto);
    }
    //利用Java8新特性对上述去重进行优化
    List<SampleInfoDto> list = sampleInfoDtoListNew.stream().collect(Collectors.collectingAndThen(
        Collectors
            .toCollection(() -> new TreeSet<>(Comparator.comparing(SampleInfoDto::getItemModel))),
        ArrayList::new));

    System.out.println(JSONArray.toJSONString(list));
    for (int i = 0; i < sampleInfoDtoListNew.size() - 1; i++) {
      for (int j = sampleInfoDtoListNew.size() - 1; j > i; j--) {
        if (sampleInfoDtoListNew
            .get(j)
            .getItemModel()
            .equals(sampleInfoDtoListNew.get(i).getItemModel())) {
          sampleInfoDtoListNew.remove(j);
        }
      }
    }
    System.out.println(JSONArray.toJSONString(sampleInfoDtoListNew));



//    Long l = null;
//    Test test = new Test();
//    test.testLong(l);
  }

  private void testLong(long b) {

  }
}
