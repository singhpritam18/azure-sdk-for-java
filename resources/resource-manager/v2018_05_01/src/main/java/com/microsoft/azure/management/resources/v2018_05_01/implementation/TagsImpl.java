/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.resources.v2018_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2018_05_01.Tags;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resources.v2018_05_01.TagDetails;
import rx.Completable;
import com.microsoft.azure.management.resources.v2018_05_01.TagValue;

class TagsImpl extends WrapperImpl<TagsInner> implements Tags {
    private final ResourcesManager manager;

    TagsImpl(ResourcesManager manager) {
        super(manager.inner().tags());
        this.manager = manager;
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    private TagDetailsImpl wrapTagDetailsModel(TagDetailsInner inner) {
        return  new TagDetailsImpl(inner, manager());
    }

    @Override
    public Observable<TagDetails> listAsync() {
        TagsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<TagDetailsInner>, Iterable<TagDetailsInner>>() {
            @Override
            public Iterable<TagDetailsInner> call(Page<TagDetailsInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TagDetailsInner, TagDetails>() {
            @Override
            public TagDetails call(TagDetailsInner inner) {
                return wrapTagDetailsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String tagName) {
        TagsInner client = this.inner();
        return client.deleteAsync(tagName).toCompletable();
    }

    @Override
    public Observable<TagDetails> createOrUpdateAsync(String tagName) {
        TagsInner client = this.inner();
        return client.createOrUpdateAsync(tagName)
        .map(new Func1<TagDetailsInner, TagDetails>() {
            @Override
            public TagDetails call(TagDetailsInner inner) {
                return new TagDetailsImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteValueAsync(String tagName, String tagValue) {
        TagsInner client = this.inner();
        return client.deleteValueAsync(tagName, tagValue).toCompletable();
    }

    @Override
    public Observable<TagValue> createOrUpdateValueAsync(String tagName, String tagValue) {
        TagsInner client = this.inner();
        return client.createOrUpdateValueAsync(tagName, tagValue)
        .map(new Func1<TagValueInner, TagValue>() {
            @Override
            public TagValue call(TagValueInner inner) {
                return new TagValueImpl(inner, manager());
            }
        });
    }

}
