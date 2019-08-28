package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.Interfaces.InformationService;
import com.kodilla.good.patterns.challenges.productOrderService.Interfaces.SellRepository;
import com.kodilla.good.patterns.challenges.productOrderService.Interfaces.SellService;

public class ProductOrderService {

    private InformationService informationService;
    private SellService sellService;
    private SellRepository sellRepository;

    public ProductOrderService(final InformationService informationService,
                           final SellService sellService,
                           final SellRepository sellRepository) {
        this.informationService = informationService;
        this.sellService = sellService;
        this.sellRepository = sellRepository;
    }

    public SellDto process(final SellRequest sellRequest) {
        boolean isSold = sellService.sell(sellRequest.getUser(), sellRequest.getProductName(),
                sellRequest.getProductPrice());

        if (isSold) {
            informationService.inform(sellRequest.getUser());
            sellRepository.createSell(sellRequest.getUser(), sellRequest.getProductName(), sellRequest.getProductPrice());
            return new SellDto(sellRequest.getUser(), true);
        } else {
            return new SellDto(sellRequest.getUser(), false);
        }
    }
}