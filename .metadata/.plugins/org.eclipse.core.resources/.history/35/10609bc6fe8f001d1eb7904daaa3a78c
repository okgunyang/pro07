<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="kr.go.molab.security.AccountMapper">

    <!-- 로그인 -->
    <select id="getAccountById" parameterType="string" resultType="Account">
    	SELECT id, password, email, phone, role FROM ACCOUNT WHERE id = #{id};
    </select>

    <!-- 회원가입 -->
    <insert id="insertAccount" parameterType="Account">
    	INSERT INTO ACCOUNT (id, password, email, phone, role) VALUES (
          #{id}, #{password}, #{email}, #{phone} , 'ROLE_USER')
    </insert>
</mapper>
