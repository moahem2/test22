public class StateChart {
    public String state = "NORMAL"; public String state1 = "TIME";
    public int m=0, h=0, D=1, M=1, Y=2000;

    public String[] input(char c){

        if(state.equals("NORMAL")) { if (c == 'c') {
            state = "UPDATE"; state1 = "min";
        }
            if (c == 'b') { state = "ALARM";
                state1 = "Alarm";
            }
            if (c == 'a') {
                if (state1.equals("TIME")) { state1 = "DATE";
                } else {
                    state1 = "TIME";
                }
            }
        }

        if(state.equals("UPDATE")) { if (c == 'd') {
            state = "NORMAL"; state1 = "TIME";
        }
            if (c == 'a') {
                if (state1.equals("year")) { state = "NORMAL";
                    state1 = "TIME";
                }
                if (state1.equals("month")) { state1 = "year";
                }
                if (state1.equals("day")) { state1 = "month";
                }
                if (state1.equals("hour")) { state1 = "day";
                }
                if (state1.equals("min") ) { state1 = "hour";
                }
            }
            if (c == 'b') {
                if (state1.equals("min")) { m++;

                    if (m >= 60) { m = 0;
                    }
                }
                if (state1.equals("hour")) { h++;
                    if (h >= 24) { h = 0;
                    }
                }
                if (state1.equals("day")) { D++;
                    if (D > 31) { D = 1;
                    }
                }
                if (state1.equals("month")) { M++;
                    if (M > 12) { M = 1;
                    }
                }
                if (state1.equals("year")) { Y++;
                    if (Y > 2100) { Y = 2000;
                    }
                }
            }
        }

        if(state.equals("ALARM")){ if (c == 'd') {
            state = "NORMAL"; state1 = "TIME";
        }
            if (c == 'a') { state1 = "Chime";
            }
        }

        return new String[]{state, state1, String.valueOf(Y) + "-" + String.valueOf(M) + "-" + String.valueOf(D), String.valueOf(h) + ":" + String.valueOf(m) };
    }

}
