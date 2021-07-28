package chap11.sec03.exam01_equals;

import java.util.Objects;

public class Member {

    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Member)) {
            return false;
        }
        Member member = (Member) obj;

        return this.id.equals(member.id);
    }

    }


