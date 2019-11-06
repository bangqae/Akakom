
editDataset(uji1)
editDataset(uji1)
editDataset(uji1)
editDataset(uji1)
editDataset(uji1)
editDataset(uji1)
editDataset(uji1)
editDataset(uji1)
editDataset(uji1)
uji2 <- read.table("D:/Semt 5/P. Statistik Induktif/P3/uji2.txt", header = TRUE, 
    sep = "", na.strings = "NA", dec = ".", strip.white = TRUE)
editDataset(uji2)
editDataset(uji2)
editDataset(uji1)
editDataset(uji1)
uji1 <- within(uji1, {
    ipk_kode <- Recode(ipk, "0 : 1.9 = 1; 2 : 2.9 = 2; else = 3", as.factor = TRUE)
})
editDataset(uji1)
editDataset(uji1)
uji1$skks_baru <- with(uji1, sks + 20)
editDataset(uji1)
editDataset(uji1)
uji1 <- within(uji1, {
    ipk_kode <- NULL
})
editDataset(uji1)
editDataset(uji1)
uji1 <- uji1[-c(2, 3), ]
editDataset(uji1)
editDataset(uji1)

