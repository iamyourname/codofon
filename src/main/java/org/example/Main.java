package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(new Bot());
    }
}

/*
connect to DB postgresql://domofon:xid123mt@45.139.77.167/domofon
 */


/* ------- SQL template
        SELECT * FROM ccodes cc
	where
			upper(cc."CITY") = upper('москва')
		AND	upper(cc."STREET") like upper('%Артамонова%')
		AND	upper(cc."HOUSE") = upper('10')
		AND	upper(cc."ENT") = upper('4')
	;
 */