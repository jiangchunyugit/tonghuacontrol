package cn.thinkfree.service.approvalflow;

import cn.thinkfree.database.model.AfApprovalRole;
import cn.thinkfree.database.model.UserRoleSet;

import java.util.List;

/**
 * 审批角色服务层
 *
 * @author song
 * @version 1.0
 * @date 2018/10/25 15:52
 */
public interface AfApprovalRoleService {
    /**
     * 根据审批顺序编号获取审批角色
     * @param configSchemeNo 审批方案编号
     * @param allRoles 所有角色信息
     * @return 审批角色信息
     */
    List<UserRoleSet> findByConfigSchemeNo(String configSchemeNo, List<UserRoleSet> allRoles);

    /**
     * 创建审批角色
     * @param configSchemeNo 审批方案编号
     * @param roles 审批角色信息
     */
    void create(String configSchemeNo, List<UserRoleSet> roles);

    /**
     * 根据审批顺序编号获取审批角色
     * @param configSchemeNo 审批方案编号
     * @return 审批角色信息
     */
    List<AfApprovalRole> findByConfigSchemeNo(String configSchemeNo);

}