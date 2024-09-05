package com.thda.thda_data_logger.controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/data")
public class DataController {

    private final DataService dataService;

    @PostMapping
    public CompletableFuture<String> create(@RequestBody CreateDateRequest request) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                dataService.create(request);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return "Data created successfully";
        });
    }

    @DeleteMapping("/{id}")
    public CompletableFuture<String> delete(@PathVariable String id) {
        return CompletableFuture.supplyAsync(() -> {
            dataService.delete(id);
            return "Data deleted successfully";
        });
    }

    @GetMapping("/{id}")
    public CompletableFuture<DataEntity> getById(@PathVariable String id) {
        return CompletableFuture.supplyAsync(() -> dataService.get(id));
    }

    @GetMapping
    public CompletableFuture<List<DataEntity>> getAll() {
        return CompletableFuture.supplyAsync(dataService::getAll);
    }
}
