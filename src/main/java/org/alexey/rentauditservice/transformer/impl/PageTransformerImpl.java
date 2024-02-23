package org.alexey.rentauditservice.transformer.impl;

import org.alexey.rentauditservice.core.dto.AuditInfoDto;
import org.alexey.rentauditservice.core.dto.PageOfAuditInfoDto;
import org.alexey.rentauditservice.transformer.PageTransformer;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class PageTransformerImpl implements PageTransformer {

    @Override
    public PageOfAuditInfoDto transformPageOfAuditInfoDtoFromPage(Page<AuditInfoDto> page) {
        return (PageOfAuditInfoDto) new PageOfAuditInfoDto()
                .setContent(page.getContent())
                .setNumber(page.getNumber())
                .setSize(page.getSize())
                .setTotalPages(page.getTotalPages())
                .setTotalElements(page.getTotalElements())
                .setFirst(page.isFirst())
                .setNumberOfElements(page.getNumberOfElements())
                .setLast(page.isLast());
    }
}
