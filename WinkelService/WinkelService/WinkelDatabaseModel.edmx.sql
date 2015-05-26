
-- --------------------------------------------------
-- Entity Designer DDL Script for SQL Server 2005, 2008, 2012 and Azure
-- --------------------------------------------------
-- Date Created: 05/26/2015 11:52:38
-- Generated from EDMX file: C:\Users\Jelte\Documents\GitHub\HU-.net-5-6\WinkelService\WinkelService\WinkelDatabaseModel.edmx
-- --------------------------------------------------

SET QUOTED_IDENTIFIER OFF;
GO
USE [WinkelDB];
GO
IF SCHEMA_ID(N'dbo') IS NULL EXECUTE(N'CREATE SCHEMA [dbo]');
GO

-- --------------------------------------------------
-- Dropping existing FOREIGN KEY constraints
-- --------------------------------------------------


-- --------------------------------------------------
-- Dropping existing tables
-- --------------------------------------------------


-- --------------------------------------------------
-- Creating all tables
-- --------------------------------------------------

-- Creating table 'Customers'
CREATE TABLE [dbo].[Customers] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [username] nvarchar(max)  NOT NULL,
    [password] nvarchar(max)  NOT NULL,
    [balance] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Products'
CREATE TABLE [dbo].[Products] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [name] nvarchar(max)  NOT NULL,
    [stock] nvarchar(max)  NOT NULL,
    [price] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'BoughtProducts'
CREATE TABLE [dbo].[BoughtProducts] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [amountBought] nvarchar(max)  NOT NULL,
    [dateBought] nvarchar(max)  NOT NULL,
    [CustomerId] int  NOT NULL,
    [ProductId] int  NOT NULL
);
GO

-- --------------------------------------------------
-- Creating all PRIMARY KEY constraints
-- --------------------------------------------------

-- Creating primary key on [Id] in table 'Customers'
ALTER TABLE [dbo].[Customers]
ADD CONSTRAINT [PK_Customers]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [Id] in table 'Products'
ALTER TABLE [dbo].[Products]
ADD CONSTRAINT [PK_Products]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [Id] in table 'BoughtProducts'
ALTER TABLE [dbo].[BoughtProducts]
ADD CONSTRAINT [PK_BoughtProducts]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- --------------------------------------------------
-- Creating all FOREIGN KEY constraints
-- --------------------------------------------------

-- Creating foreign key on [CustomerId] in table 'BoughtProducts'
ALTER TABLE [dbo].[BoughtProducts]
ADD CONSTRAINT [FK_CustomerBoughtProduct]
    FOREIGN KEY ([CustomerId])
    REFERENCES [dbo].[Customers]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_CustomerBoughtProduct'
CREATE INDEX [IX_FK_CustomerBoughtProduct]
ON [dbo].[BoughtProducts]
    ([CustomerId]);
GO

-- Creating foreign key on [ProductId] in table 'BoughtProducts'
ALTER TABLE [dbo].[BoughtProducts]
ADD CONSTRAINT [FK_ProductBoughtProduct]
    FOREIGN KEY ([ProductId])
    REFERENCES [dbo].[Products]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_ProductBoughtProduct'
CREATE INDEX [IX_FK_ProductBoughtProduct]
ON [dbo].[BoughtProducts]
    ([ProductId]);
GO

-- --------------------------------------------------
-- Script has ended
-- --------------------------------------------------