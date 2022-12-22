package com.niimto.automation.model.service.classifier;

import com.niimto.automation.entity.classifier.position.EmployeeBranch;
import com.niimto.automation.entity.classifier.position.EmployeeDepartment;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class EmployeeDepartmentService {

    public Map<EmployeeBranch, String> getBranchValNameMap(String departmentJson) {

        Map<EmployeeBranch, String> valNameMap = new HashMap<>();
        getBranchSet(departmentJson).forEach(
                branch -> {
                    valNameMap.put(branch, branch.getShortName());
                }
        );
        return valNameMap;
    }

    private Map<String, Object> getMapFromJson(String departmentJson) {
        JsonParser parser = JsonParserFactory.getJsonParser();
        return parser.parseMap(departmentJson);
    }

    private Set<EmployeeBranch> getBranchSet(String departmentJson) {
        return EmployeeDepartment
                .valueOf((String) getMapFromJson(departmentJson).get("selected"))
                .getBranch();
    }
}
