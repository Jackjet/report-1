package com.report.biz.admin.service;

import com.report.common.dal.admin.entity.dto.Member;
import com.report.common.dal.admin.entity.vo.MemberCriteriaModel;
import com.report.facade.entity.DataGrid;
import com.report.facade.entity.PageHelper;

public interface MemberService {

    /**
     * 查找列表
     * 
     * @param pageHelper 分页对象
     */
    //	DataGrid findMembers(PageHelper pageHelper, Long currentMemberId);

    /**
     * 更新对象
     * 
     * @param member
     */
    boolean updateMember(Member member, String groupCode, String currentMemberIp, Long currentMemberId);

    /**
     * 保存对象
     * 
     * @param member
     */
    void saveMember(Member member, String groupCode, String currentMemberIp, Long currentMemberId);

    /**
     * 删除对象
     * 
     * @param id
     * @return
     */
    boolean deleteMemberById(Long Id, String memberIp);

    //	DataGrid findMemberListByName(String name, PageHelper pageHelper, Long currentMemberId);

    boolean isPasswordRight(Long currentMemberId, String password);

    boolean resetPassword(Long memberId, String memberIp);

    boolean isAccNoExists(String accNo);

    boolean changePassword(String trim, Long currentMemberId, String memberIp);

    DataGrid findMemberListByCriteria(MemberCriteriaModel memberCriteria, PageHelper pageHelper);

    Member getMemberByLoginName(String loginName);
}