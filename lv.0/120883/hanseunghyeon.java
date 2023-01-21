class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int index = 0;
        // id 유무 확인
        for (int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])){
                index = i;
                break;
            }
        }
        return db[index][0].equals(id_pw[0]) ? (db[index][1].equals(id_pw[1]) ? "login": "wrong pw") : "fail";
    }
}