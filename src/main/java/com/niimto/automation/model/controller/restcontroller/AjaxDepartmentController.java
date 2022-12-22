package com.niimto.automation.model.controller.restcontroller;

import com.niimto.automation.model.facade.classifier.EmployeeDepartmentFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxDepartmentController {

    private final EmployeeDepartmentFacade departmentFacade;

    public AjaxDepartmentController(EmployeeDepartmentFacade departmentFacade) {
        this.departmentFacade = departmentFacade;
    }

    @PostMapping("/selectBranch")
    public ResponseEntity<Object> selectBranch(@RequestBody String department) {
        return new ResponseEntity<>(departmentFacade.getAjaxBranchResponse(department), HttpStatus.OK);
    }


}
