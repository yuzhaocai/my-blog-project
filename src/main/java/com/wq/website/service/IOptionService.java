package com.wq.website.service;

import com.wq.website.modal.Vo.OptionVo;

import java.util.List;

/**
 * options的接口
 * Created by BlueT on 2017/3/7.
 */
public interface IOptionService {

    void insertOption(OptionVo optionVo);

    void insertOption(String name, String value);

    List<OptionVo> getOptions();
}