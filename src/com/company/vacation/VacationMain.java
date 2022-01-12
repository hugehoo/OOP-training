package com.company.vacation;

public class VacationMain {

    public static void main(String[] args) {
        Person person = new Person();
        Approval approval = new Approval(person);
        Vacation vacation = new Vacation(person);

        if (vacation.dayOff()) {
            if (approval.settingApprovalLine(person)) {
                vacation.deductVacation();
            }
        }
        approval.terminateApproval();
    }
}
