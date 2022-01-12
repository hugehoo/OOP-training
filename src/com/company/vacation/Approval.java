package com.company.vacation;

public class Approval {

    Person person;

    public Approval(Person person) {
        this.person = person;
    }

    public boolean settingApprovalLine(Person person) {
        String approvalLine = person.approvalLine;
        return requestApproval(approvalLine);
    }

    public boolean requestApproval(String approvalLine) {

        // logic 간략화 -> 결재라인에 따라 결재가 완료됐다고 하자.
        if (true) {
            return true;
        } else {
            return false;
        }
    }

    public void terminateApproval() {
        return;
    }


}
