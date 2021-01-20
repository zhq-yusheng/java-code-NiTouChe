package com.yu.feiqian.mapper;

import com.yu.feiqian.view.Jview;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface QueryStudentMapper {

    @Select("select count(*)as'rs' from tblesmp where code = '早退' and sStime like #{format}")
    Jview queryJZT(@Param("format") String format);

    @Select("select count(*)as'rs' from tblesmp where code = '迟到' and sStime like #{format}")
    Jview queryJCD(@Param("format") String format);

    @Select("select count(*)as'rs' from tblesmp where code = '正常' and sStime like #{format}")
    Jview queryJZC(@Param("format") String format);


}
