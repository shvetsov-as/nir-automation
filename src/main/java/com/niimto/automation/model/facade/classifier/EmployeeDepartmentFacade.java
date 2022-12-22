package com.niimto.automation.model.facade.classifier;

import com.niimto.automation.entity.classifier.position.EmployeeBranch;
import com.niimto.automation.model.service.classifier.EmployeeDepartmentService;
import com.niimto.automation.web.response.AjaxResponse;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EmployeeDepartmentFacade {

    private final EmployeeDepartmentService departmentService;

    public EmployeeDepartmentFacade(EmployeeDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public AjaxResponse<Object> getAjaxBranchResponse (String departmentJson) {
        Map<EmployeeBranch, String> branchValNameMap = departmentService.getBranchValNameMap(departmentJson);
        return AjaxResponse.builder().status("success").data(branchValNameMap).build();
    }
}
