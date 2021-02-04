package com.android.example.module06_module121_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_2.hasEnabledCallbacks()

		for (iAb in 0..5) {
			param0.dispose()

			val local_var_3_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
			local_var_3_0.approveCall("SomeString", 42)

			local_var_3_0.approveCall("SomeString", 1)

		}
		val local_var_2_3: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_3.postValue(kotlin.Any())

		val local_var_2_4: androidx.collection.SparseArrayCompat<kotlin.Any> = androidx.collection.SparseArrayCompat()
		local_var_2_4.replace(75, kotlin.Any(), kotlin.Any())

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.isCanceled()

		val local_var_2_4: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_4.setValue(kotlin.Any())

		val local_var_2_5: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_5.postValue(kotlin.Any())

	}

	fun method3(
		param0: io.reactivex.disposables.SerialDisposable,
		param1: io.reactivex.internal.util.LinkedArrayList,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.disposables.SerialDisposable
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.getCancellationSignalObject()

		param0.dispose()

		param0.isDisposed()

	}
}
