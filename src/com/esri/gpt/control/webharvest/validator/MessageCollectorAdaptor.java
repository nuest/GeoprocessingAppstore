/*
 * Copyright 2013 Esri.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.esri.gpt.control.webharvest.validator;

import com.esri.gpt.framework.jsf.MessageBroker;

/**
 * Message collector adaptor.
 */
public class MessageCollectorAdaptor implements IMessageCollector {
  private MessageBroker mb;

  /**
   * Creates instance of the adaptor.
   * @param mb message broker
   */
  public MessageCollectorAdaptor(MessageBroker mb) {
    this.mb = mb;
  }

  @Override
  public void addErrorMessage(String resourceKey) {
    mb.addErrorMessage(resourceKey);
  }

  @Override
  public void addErrorMessage(String resourceKey, Object[] parameters) {
    mb.addErrorMessage(resourceKey, parameters);
  }

  @Override
  public void addSuccessMessage(String resourceKey) {
    mb.addSuccessMessage(resourceKey);
  }

  @Override
  public void addSuccessMessage(String resourceKey, Object[] parameters) {
    mb.addSuccessMessage(resourceKey, parameters);
  }
}
