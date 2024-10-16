package ru.selfvsself.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class ChatRequest {
    private Long chatId;
    private String userName;
    private String content;
    private UUID requestId;
    private boolean useMessageHistory = true;
    private boolean useLocalModel = true;
}
